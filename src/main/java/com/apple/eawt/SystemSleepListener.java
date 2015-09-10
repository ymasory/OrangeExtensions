package com.apple.eawt;

public abstract interface SystemSleepListener extends AppEventListener
{
    public abstract void systemAboutToSleep(AppEvent.SystemSleepEvent paramSystemSleepEvent);

    public abstract void systemAwoke(AppEvent.SystemSleepEvent paramSystemSleepEvent);
}
