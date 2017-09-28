package com.wearedevs.javaclicker.util;

import java.awt.*;
import java.awt.TrayIcon.MessageType;

public class Notification {
	public static TrayIcon trayIcon;
	public static void init(String name, String tooltip, String iconPath) {
        if (!SystemTray.isSupported()) {
            System.err.println("System tray not supported!");
            return;
        }
        SystemTray tray = SystemTray.getSystemTray();
		Image image = Toolkit.getDefaultToolkit().createImage(ClassLoader.getSystemClassLoader().getResource(iconPath));
        trayIcon = new TrayIcon(image, name);
        //Let the system resizes the image if needed
        trayIcon.setImageAutoSize(true);
        //Set tooltip text for the tray icon
        trayIcon.setToolTip(tooltip);
        try {
			tray.add(trayIcon);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    public static void displayNotif(String title, String desc, MessageType type) {
        if (SystemTray.isSupported()) {
        	trayIcon.displayMessage(title, desc, type);
        } else {
            System.err.println("System tray not supported!");
        }
    }
}