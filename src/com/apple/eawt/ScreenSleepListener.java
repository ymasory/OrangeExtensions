package com.apple.eawt;

public interface ScreenSleepListener extends AppEventListener {
    public void screenAboutToSleep(AppEvent.ScreenSleepEvent e);
    public void screenAwoke(AppEvent.ScreenSleepEvent e);
}
