package com.apple.eawt;

public interface AppForegroundListener extends AppEventListener {

    public void appMovedToBackground(AppEvent.AppForegroundEvent e);
    public void appRaisedToForeground(AppEvent.AppForegroundEvent e);
}
