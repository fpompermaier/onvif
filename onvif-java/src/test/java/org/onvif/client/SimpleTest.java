package org.onvif.client;

import java.io.File;
import java.io.FileInputStream;
import java.net.ConnectException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

import javax.xml.soap.SOAPException;

import org.apache.commons.io.FileUtils;
import org.onvif.ver10.schema.MediaUri;

import de.onvif.soap.OnvifDevice;

public class SimpleTest {

	// This test reads connection params from a properties file and take a
	// screenshot
	public static void main(String[] args) throws Exception {
		final Map<String, OnvifDevice> onvifCameras = new HashMap<>();
		final Map<String, String> onvifCamerasTokens = new HashMap<>();
		final String propFileRelativePath = "src/test/resources/onvif.properties";
		final Properties config = new Properties();
		config.load(new FileInputStream(new File(propFileRelativePath)));
		String firstCamId = null;
		for (Entry<Object, Object> entry : config.entrySet()) {
			String deviceName = (String) entry.getKey();
			String[] confStr = ((String) entry.getValue()).split(",");
			String deviceIp = confStr[0];
			String user = confStr[1];
			String password = confStr[2];
			// profileToken = "MediaProfile000"/"MediaProfile001";
			String profileToken = confStr[3];
			try {
				System.out.println("Connect to camera, please wait ...");
				OnvifDevice cam = OnvifDevice.builder(deviceIp).username(user).password(password).build();
				System.out.printf("Connected to device %s (%s)\n", cam.getDeviceInfo(), deviceName);
				onvifCameras.put(deviceName, cam);
				onvifCamerasTokens.put(deviceName, profileToken);
				if (firstCamId == null)
					firstCamId = deviceName;
			} catch (ConnectException | SOAPException e1) {
				System.err.println("No connection to device with ip " + deviceIp + ", please try again.");
				System.exit(0);
			}
		}
		if (firstCamId == null) {
			System.out.println("No ONVIF devices found");
			return;
		}
		// take the first OnvifDevice
		OnvifDevice firstCam = onvifCameras.get(firstCamId);
		String profileToken = onvifCamerasTokens.get(firstCamId);

		// Example 1 - take a snapshot (the file gets deleted once the app ends..)
		MediaUri sceenshotUri = firstCam.getMedia().getSnapshotUri(profileToken);
		File tempFile = File.createTempFile("tmp", ".jpg");
		FileUtils.copyURLToFile(new URL(sceenshotUri.getUri()), tempFile);

	}

}