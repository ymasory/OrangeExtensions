package com.apple.eawt;

public abstract interface AppHiddenListener extends AppEventListener
{
    public abstract void appHidden(AppEvent.AppHiddenEvent paramAppHiddenEvent);

    public abstract void appUnhidden(AppEvent.AppHiddenEvent paramAppHiddenEvent);
}
