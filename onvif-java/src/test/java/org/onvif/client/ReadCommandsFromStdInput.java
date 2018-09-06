package org.onvif.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ConnectException;
import java.util.List;

import javax.xml.soap.SOAPException;

import org.onvif.ver10.schema.Profile;

import de.onvif.soap.OnvifDevice;

public class ReadCommandsFromStdInput {

    private static final String INFO = "Commands:\n  \n  url: Get snapshort URL.\n  info: Get information about each valid command.\n  profiles: Get all profiles.\n  exit: Exit this application.";

    public static void main(String args[]) {
        InputStreamReader inputStream = new InputStreamReader(System.in);
        BufferedReader keyboardInput = new BufferedReader(inputStream);
        String input, cameraAddress, user, password;

        try {
            System.out.println("Please enter camera IP (with port if not 80):");
            cameraAddress = keyboardInput.readLine();
            System.out.println("Please enter camera username:");
            user = keyboardInput.readLine();
            System.out.println("Please enter camera password:");
            password = keyboardInput.readLine();
        } catch (IOException e1) {
            e1.printStackTrace();
            return;
        }

        System.out.println("Connect to camera, please wait ...");
        OnvifDevice cam;
        try {
            cam = OnvifDevice.builder(cameraAddress).username(user).password(password).build();
            // new // OnvifDevice(cameraAddress, // user, password);
        } catch (ConnectException | SOAPException e1) {
            System.err.println("No connection to camera, please try again.");
            return;
        }
        System.out.println("Connection to camera successful!");

        while (true) {
            try {
                System.out.println();
                System.out.println("Enter a command (type \"info\" to get commands):");
                input = keyboardInput.readLine();

                switch (input) {
                    case "url": {
                        List<Profile> profiles = cam.getMedia().getProfiles();
                        for (Profile p : profiles) {
                            System.out.println("URL from Profile \'" + p.getName() + "\': "
                                    + cam.getMedia().getSnapshotUri(p.getToken()));
                        }
                        break;
                    }
                    case "profiles":
                        List<Profile> profiles = cam.getMedia().getProfiles();
                        System.out.println("Number of profiles: " + profiles.size());
                        for (Profile p : profiles) {
                            System.out.println("  Profile " + p.getName() + " token is: " + p.getToken());
                        }
                        break;
                    case "info":
                        System.out.println(INFO);
                        break;
                    case "quit":
                    case "exit":
                    case "end":
                        return;
                    default:
                        System.out.println("Unknown command!");
                        System.out.println();
                        System.out.println(INFO);
                        break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}