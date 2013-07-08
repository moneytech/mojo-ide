package com.embeddedmicro.mojo;

import java.util.prefs.Preferences;

public class Settings {
	public static Preferences settings = Preferences
			.userNodeForPackage(com.embeddedmicro.mojo.Settings.class);
	
	public static final String MOJO_PORT = "MOJO_PORT";
	public static final String WINDOW_WIDTH = "WINDOW_WIDTH";
	public static final String WINDOW_HEIGHT = "WINDOW_HEIGHT";
	public static final String FILE_LIST_WIDTH = "FILE_LIST_WIDTH";
}
