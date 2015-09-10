package com.apple.eawt;
 
import java.awt.Image;
import java.awt.Point;
import java.awt.PopupMenu;
import java.awt.Window;
import javax.swing.JMenuBar;
 
public class Application
{
    static RuntimeException unimplemented()
    {
        return new RuntimeException("Unimplemented");
    }
 
    public static Application getApplication() {
        throw unimplemented();
    }
 
    @Deprecated
    public Application() {
        throw unimplemented();
    }
 
    public void addAppEventListener(AppEventListener paramAppEventListener) {
        throw unimplemented();
    }
 
    public void removeAppEventListener(AppEventListener paramAppEventListener) {
        throw unimplemented();
    }
 
    public void setAboutHandler(AboutHandler paramAboutHandler) {
        throw unimplemented();
    }
 
    public void setPreferencesHandler(PreferencesHandler paramPreferencesHandler) {
        throw unimplemented();
    }
 
    public void setOpenFileHandler(OpenFilesHandler paramOpenFilesHandler) {
        throw unimplemented();
    }
 
    public void setPrintFileHandler(PrintFilesHandler paramPrintFilesHandler) {
        throw unimplemented();
    }
 
    public void setOpenURIHandler(OpenURIHandler paramOpenURIHandler) {
        throw unimplemented();
    }
 
    public void setQuitHandler(QuitHandler paramQuitHandler) {
        throw unimplemented();
    }
 
    public void setQuitStrategy(QuitStrategy paramQuitStrategy) {
        throw unimplemented();
    }
 
    public void enableSuddenTermination() {
        throw unimplemented();
    }
 
    public void disableSuddenTermination() {
        throw unimplemented();
    }
 
    public void requestForeground(boolean paramBoolean) {
        throw unimplemented();
    }
 
    public void requestUserAttention(boolean paramBoolean) {
        throw unimplemented();
    }
 
    public void openHelpViewer() {
        throw unimplemented();
    }
 
    public void setDockMenu(PopupMenu paramPopupMenu) {
        throw unimplemented();
    }
 
    public PopupMenu getDockMenu() {
        throw unimplemented();
    }
 
    public void setDockIconImage(Image paramImage) {
        throw unimplemented();
    }
 
    public Image getDockIconImage() {
        throw unimplemented();
    }
 
    public void setDockIconBadge(String paramString) {
        throw unimplemented();
    }
 
    public void setDefaultMenuBar(JMenuBar paramJMenuBar) {
        throw unimplemented();
    }
 
    public void requestToggleFullScreen(Window paramWindow) {
        throw unimplemented();
    }
 
    @Deprecated
    public void addApplicationListener(ApplicationListener paramApplicationListener)
    {
        throw unimplemented();
    }
 
    @Deprecated
    public void removeApplicationListener(ApplicationListener paramApplicationListener) {
        throw unimplemented();
    }
 
    @Deprecated
    public void setEnabledPreferencesMenu(boolean paramBoolean) {
        throw unimplemented();
    }
 
    @Deprecated
    public void setEnabledAboutMenu(boolean paramBoolean) {
        throw unimplemented();
    }
 
    @Deprecated
    public boolean getEnabledPreferencesMenu() {
        throw unimplemented();
    }
 
    @Deprecated
    public boolean getEnabledAboutMenu() {
        throw unimplemented();
    }
 
    @Deprecated
    public boolean isAboutMenuItemPresent() {
        throw unimplemented();
    }
 
    @Deprecated
    public void addAboutMenuItem() {
        throw unimplemented();
    }
 
    @Deprecated
    public void removeAboutMenuItem() {
        throw unimplemented();
    }
 
    @Deprecated
    public boolean isPreferencesMenuItemPresent() {
        throw unimplemented();
    }
 
    @Deprecated
    public void addPreferencesMenuItem() {
        throw unimplemented();
    }
 
    @Deprecated
    public void removePreferencesMenuItem() {
        throw unimplemented();
    }
 
    @Deprecated
    public static Point getMouseLocationOnScreen() {
        throw unimplemented();
    }
}
