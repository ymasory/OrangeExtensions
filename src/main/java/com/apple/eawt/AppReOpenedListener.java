package com.apple.eawt;

public abstract interface AppReOpenedListener extends AppEventListener
{
    public abstract void appReOpened(AppEvent.AppReOpenedEvent paramAppReOpenedEvent);
}
