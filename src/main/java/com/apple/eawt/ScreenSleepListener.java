package com.apple.eawt;

public abstract interface ScreenSleepListener extends AppEventListener
{
    public abstract void screenAboutToSleep(AppEvent.ScreenSleepEvent paramScreenSleepEvent);

    public abstract void screenAwoke(AppEvent.ScreenSleepEvent paramScreenSleepEvent);
}
