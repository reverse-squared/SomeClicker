package com.wearedevs.javaclicker.util;

import java.awt.*;
import java.awt.TrayIcon.MessageType;

/**
 * Used For Playing Desktop Notifications to Notify The User About a New Event, Such as Getting a New Case.
 */
public class NotificationUtil {
	public static TrayIcon trayIcon;
	final static PopupMenu popup = new PopupMenu();
	
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
        
        MenuItem exitItem = new MenuItem("Exit");
        popup.add(exitItem);
        trayIcon.setPopupMenu(popup);
        
        try {
			tray.add(trayIcon);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * @param title The Main Notification Title
	 * @param desc The Smaller Text of the Notification
	 * @param type What Symbol Shows for the Notification. For Example  {@code MessageType.INFO}
	 */
    public static void displayCaseNotif(String title, String desc, MessageType type) {
        if (SystemTray.isSupported()) {
        	trayIcon.displayMessage(title, desc, type);
        } else {
            System.err.println("System tray not supported!");
        }
    }
}