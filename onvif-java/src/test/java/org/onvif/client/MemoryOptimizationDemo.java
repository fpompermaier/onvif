package org.onvif.client;

import de.onvif.soap.OnvifDevice;
import de.onvif.soap.OnvifServiceFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ONVIF Device Memory Optimization Demo
 *
 * Demonstrates the effects of new lazy initialization and Schema caching features:
 * 1. Schema Caching: Avoid repeated WSDL parsing
 * 2. Lazy Initialization: Create services only when needed
 * 3. Capabilities Caching: Avoid repeated network requests
 *
 * @author ONVIF Optimization Team
 */
public class MemoryOptimizationDemo {
    private static final Logger LOG = LoggerFactory.getLogger(MemoryOptimizationDemo.class);

    public static void main(String[] args) throws IOException {
        LOG.info("=== ONVIF Device Memory Optimization Demo ===");

        OnvifCredentials creds = GetTestDevice.getOnvifCredentials(args);
        if (creds == null) {
            LOG.error("Please provide valid ONVIF device credentials");
            return;
        }

        // Demo 1: Single device memory optimization
        demonstrateSingleDeviceOptimization(creds);

        // Demo 2: Multi-device Schema caching effects
        demonstrateMultiDeviceCaching(creds);

        // Demo 3: Lazy initialization effects
        demonstrateLazyInitialization(creds);

        // Clean up resources
        OnvifDevice.cleanupResources();
        LOG.info("=== Demo Completed ===");
    }

    /**
     * Demonstrate memory optimization effects for single device
     */
    private static void demonstrateSingleDeviceOptimization(OnvifCredentials creds) {
        LOG.info("\n--- Demo 1: Single Device Memory Optimization ---");

        try {
            long startTime = System.currentTimeMillis();
            long startMemory = getUsedMemory();

            // Create device instance
            OnvifDevice device = new OnvifDevice(creds.getHost(), creds.getUser(), creds.getPassword());

            long initTime = System.currentTimeMillis() - startTime;
            long initMemory = getUsedMemory() - startMemory;

            LOG.info("🚀 Device initialization completed:");
            LOG.info("   ⏱️  Initialization time: {}ms", initTime);
            LOG.info("   🧠 Initial memory usage: {}MB", initMemory / 1024 / 1024);
            LOG.info("   📊 Initialized services: {}/5", device.getInitializedServicesCount());
            LOG.info("   📋 Device info: {}", device.getDeviceInfo());

            // Access services on demand
            LOG.info("\n📺 Accessing Media service...");
            if (device.getMedia() != null) {
                LOG.info("   ✅ Media service initialized (lazy loading)");
                LOG.info("   📊 Currently initialized services: {}/5", device.getInitializedServicesCount());
            }

            LOG.info("\n🎮 Checking PTZ service...");
            if (device.getPtz() != null) {
                LOG.info("   ✅ PTZ service initialized (lazy loading)");
            } else {
                LOG.info("   ❌ PTZ service not available");
            }

            LOG.info("\n📊 Final statistics:");
            LOG.info("   Initialized services: {}/5", device.getInitializedServicesCount());
            LOG.info("   Total memory usage: {}MB", (getUsedMemory() - startMemory) / 1024 / 1024);

        } catch (Exception e) {
            LOG.error("Device connection failed: {}", e.getMessage());
        }
    }

    /**
     * Demonstrate multi-device Schema caching effects
     */
    private static void demonstrateMultiDeviceCaching(OnvifCredentials creds) {
        LOG.info("\n--- Demo 2: Multi-Device Schema Caching Effects ---");

        List<OnvifDevice> devices = new ArrayList<>();
        long totalStartTime = System.currentTimeMillis();
        long startMemory = getUsedMemory();

        try {
            // Create multiple device instances to demonstrate caching effects
            int deviceCount = 3; // Create 3 connections to the same device for demo purposes

            for (int i = 0; i < deviceCount; i++) {
                long deviceStartTime = System.currentTimeMillis();

                OnvifDevice device = new OnvifDevice(creds.getHost(), creds.getUser(), creds.getPassword());
                devices.add(device);

                long deviceTime = System.currentTimeMillis() - deviceStartTime;
                LOG.info("📱 Device {} initialization time: {}ms (cache {})",
                    i + 1, deviceTime, OnvifServiceFactory.getCacheSize() > 0 ? "active" : "inactive");
            }

            long totalTime = System.currentTimeMillis() - totalStartTime;
            long totalMemory = getUsedMemory() - startMemory;

            LOG.info("\n📈 Multi-device statistics:");
            LOG.info("   Device count: {}", deviceCount);
            LOG.info("   Total initialization time: {}ms", totalTime);
            LOG.info("   Average initialization time: {}ms", totalTime / deviceCount);
            LOG.info("   Total memory usage: {}MB", totalMemory / 1024 / 1024);
            LOG.info("   Average memory usage: {}MB", totalMemory / deviceCount / 1024 / 1024);
            LOG.info("   Schema cache entries: {}", OnvifServiceFactory.getCacheSize());

        } catch (Exception e) {
            LOG.error("Multi-device creation failed: {}", e.getMessage());
        }
    }

    /**
     * Demonstrate lazy initialization effects
     */
    private static void demonstrateLazyInitialization(OnvifCredentials creds) {
        LOG.info("\n--- Demo 3: Lazy Initialization Effects ---");

        try {
            OnvifDevice device = new OnvifDevice(creds.getHost(), creds.getUser(), creds.getPassword());

            LOG.info("🏗️  Device creation completed, checking service initialization status:");
            logServiceStatus(device);

            LOG.info("\n📺 First access to Media service...");
            device.getMedia();
            logServiceStatus(device);

            LOG.info("\n🎮 First access to PTZ service...");
            device.getPtz();
            logServiceStatus(device);

            LOG.info("\n🖼️  First access to Imaging service...");
            device.getImaging();
            logServiceStatus(device);

            LOG.info("\n📡 First access to Events service...");
            device.getEvents();
            logServiceStatus(device);

            LOG.info("\n🎯 Lazy initialization demo completed");
            LOG.info("   Advantage: Resources are allocated only when services are actually needed");
            LOG.info("   Result: Significantly reduced initial memory usage and startup time");

        } catch (Exception e) {
            LOG.error("Lazy initialization demo failed: {}", e.getMessage());
        }
    }

    /**
     * Log service initialization status
     */
    private static void logServiceStatus(OnvifDevice device) {
        LOG.info("   📊 Service initialization status:");
        LOG.info("      Device: {} | Media: {} | PTZ: {} | Imaging: {} | Events: {}",
            device.isServiceInitialized("device") ? "✅" : "❌",
            device.isServiceInitialized("media") ? "✅" : "❌",
            device.isServiceInitialized("ptz") ? "✅" : "❌",
            device.isServiceInitialized("imaging") ? "✅" : "❌",
            device.isServiceInitialized("events") ? "✅" : "❌"
        );
        LOG.info("      Total: {}/5 services initialized", device.getInitializedServicesCount());
    }

    /**
     * Get current used memory
     */
    private static long getUsedMemory() {
        Runtime runtime = Runtime.getRuntime();
        runtime.gc(); // Suggest garbage collection for more accurate memory readings
        return runtime.totalMemory() - runtime.freeMemory();
    }

    /**
     * Format memory size
     */
    private static String formatMemory(long bytes) {
        return String.format("%.2f MB", bytes / 1024.0 / 1024.0);
    }
}