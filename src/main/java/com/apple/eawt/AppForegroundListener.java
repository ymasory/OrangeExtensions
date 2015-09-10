package com.apple.eawt;

public abstract interface AppForegroundListener extends AppEventListener
{
    public abstract void appRaisedToForeground(AppEvent.AppForegroundEvent paramAppForegroundEvent);

    public abstract void appMovedToBackground(AppEvent.AppForegroundEvent paramAppForegroundEvent);
}
