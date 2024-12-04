package org.onvif.client;

import de.onvif.soap.OnvifDevice;
import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import org.apache.commons.io.FileUtils;

public class SimpleTest {

  // This test reads connection params from a properties file and take a
  // screenshot
  public static void main(String[] args) throws Exception {

    final Map<String, OnvifDevice> onvifCameras = new HashMap<>();
    final Map<String, OnvifCredentials> credentialsMap = new HashMap<>();
    final String propFileRelativePath = "onvif-java/src/test/resources/onvif.properties";
    final Properties config = new Properties();
    final File f = new File(propFileRelativePath);
    if (!f.exists()) throw new Exception("fnf: " + f.getAbsolutePath());
    config.load(new FileInputStream(f));

    for (Object k : config.keySet()) {
      String line = config.get(k.toString()).toString();
      OnvifCredentials credentials = GetTestDevice.parse(line);
      if (credentials != null) {
        try {
          System.out.println("Connect to camera, please wait ...");
          OnvifDevice cam =
              new OnvifDevice(
                  credentials.getHost(), credentials.getUser(), credentials.getPassword());
          System.out.printf("Connected to device %s (%s)%n", cam.getDeviceInfo(), k.toString());
          System.out.println(TestDevice.inspect(cam));

          String snapshotUri = cam.getSnapshotUri();
          if (!snapshotUri.isEmpty()) {
            File tempFile = File.createTempFile("tmp", ".jpg");

            // Note: This will likely fail if the camera/device is password protected.
            // embedding the user:password@ into the URL will not work with FileUtils.copyURLToFile
            FileUtils.copyURLToFile(new URL(snapshotUri), tempFile);
            System.out.println(
                "snapshot: " + tempFile.getAbsolutePath() + " length:" + tempFile.length());
          }

        } catch (Throwable th) {
          System.err.println("Error on device: " + k);
          th.printStackTrace();
        }
      }
    }
  }
}
