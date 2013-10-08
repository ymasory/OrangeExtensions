package com.apple.eawt;

/**
 * The strategy use to shut down the application, if Sudden Termination is not
 * enabled.
 * 
 * @since 10.6 Update 3 and 10.5 Update 8
 */
public enum QuitStrategy {
	/**
	 * Shuts down the application by closing each window from back-to-front.
	 */
	CLOSE_ALL_WINDOWS,
	
	/**
	 * Shuts down the application by calling <tt>System.exit(0)</tt>.  This is
	 * the default strategy. 
	 */
	SYSTEM_EXIT_0
}
