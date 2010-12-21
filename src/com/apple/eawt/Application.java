package com.apple.eawt;

import java.awt.Image;
import java.awt.Point;
import java.awt.PopupMenu;

import javax.swing.JMenuBar;

public class Application {
    
    @Deprecated
	public Application() {System.err.println("You are using the dummy jar!");}

    @Deprecated
    public void addAboutMenuItem() {}

    @Deprecated
    public void addApplicationListener(ApplicationListener listener) {}

    /**
     * @Since 10.6 Update 3 and 10.5 Update 8
     */
    public void addAppEventListener(AppEventListener listener) {}

    @Deprecated
    public void addPreferencesMenuItem() {}        

    /**
     * @Since 10.6 Update 3 and 10.5 Update 8
     */
    public void disableSuddenTermination() {}

    /**
     * @Since 10.6 Update 3 and 10.5 Update 8
     */
    public void enableSuddenTermination() {}

    public static Application getApplication() {
        return null;
    }
    
    public Image getDockIconImage() {
    	return null;
    }
    
    public PopupMenu getDockMenu() {
    	return null;
    }

    @Deprecated
    public boolean getEnabledAboutMenu() {
        return false;
    }

    @Deprecated
    public boolean getEnabledPreferencesMenu() {
        return false;
    }

    @Deprecated
    public static Point getMouseLocationOnScreen() {
        return null;
    }

    @Deprecated
    public boolean isAboutMenuItemPresent() {
        return false;
    }

    @Deprecated
    public boolean isPreferencesMenuItemPresent() {
        return false;
    }
    
    public void openHelpViewer() {}

    @Deprecated
    public void removeAboutMenuItem() {}

    /**
     * @Since 10.6 Update 3 and 10.5 Update 8
     */
    public void removeAppEventListener(AppEventListener listener) {}

    public void removeApplicationListener(ApplicationListener listener) {}

    @Deprecated
    public void removePreferencesMenuItem() {}
    
    public void setDockIconBadge(String badge) {}
    
    public void setDockIconImage(Image image) {}
    
    public void setDockMenu(PopupMenu menu) {}

    @Deprecated
    public void setEnabledAboutMenu(boolean enable) {}

    @Deprecated
    public void setEnabledPreferencesMenu(boolean enable) {}

    /** 
     * @Since 10.6 Update 1 and 10.5 Update 5 
     */
    public void requestForeground(boolean allWindows) {}

    /** 
     * @Since 10.6 Update 1 and 10.5 Update 5 
     */
    public void requestUserAttention(boolean critical) {}

    /** 
     * @Since 10.6 Update 1 and 10.5 Update 5 
     */
    public void setDefaultMenuBar(JMenuBar menuBar) {}

    /**
     * @Since 10.6 Update 3 and 10.5 Update 8
     */
    public void setOpenURIHandler(OpenURIHandler openURIHandler) {}


    /**
     * @Since 10.6 Update 3 and 10.5 Update 8
     */
    public void setAboutHandler(AboutHandler aboutHandler) {}

    /**
     * @Since 10.6 Update 3 and 10.5 Update 8
     */
    public void setOpenFileHandler(OpenFilesHandler openFileHandler) {}

    /**
     * @Since 10.6 Update 3 and 10.5 Update 8
     */
    public void setPrintFileHandler(PrintFilesHandler printFileHandler) {}

    /**
     * @Since 10.6 Update 3 and 10.5 Update 8
     */
    public void setPreferencesHandler(PreferencesHandler preferencesHandler) {}

    /**
     * @Since 10.6 Update 3 and 10.5 Update 8
     */
    public void setQuitHandler(QuitHandler quitHandler) {}
}
