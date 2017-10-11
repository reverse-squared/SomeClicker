package com.wearedevs.javaclicker.util;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.TrayIcon.MessageType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.wearedevs.javaclicker.Main;

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
        trayIcon.setImageAutoSize(true);
        trayIcon.setToolTip(tooltip);
        
        trayIcon.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Main.openWindow();
				
			}
		});
        
        MenuItem openItem = new MenuItem("Open");
        popup.add(openItem);
        trayIcon.setPopupMenu(popup);
        openItem.addActionListener(new ActionListener() {
		   public void actionPerformed(ActionEvent e) {
			   Main.openWindow();
		   }
		});
        
        MenuItem exitItem = new MenuItem("Exit");
        popup.add(exitItem);
        trayIcon.setPopupMenu(popup);
        exitItem.addActionListener(new ActionListener() {
		   public void actionPerformed(ActionEvent e) {
			   System.exit(0);
		   }
		});
        
        try {
			tray.add(trayIcon);
		} catch (AWTException e) {
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
            System.err.println("System Tray Not Supported!");
        }
    }
}