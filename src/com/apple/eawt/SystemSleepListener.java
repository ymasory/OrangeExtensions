package com.apple.eawt;

public interface SystemSleepListener extends AppEventListener {
    public void systemAboutToSleep(AppEvent.SystemSleepEvent e);
    public void systemAweoke(AppEvent.SystemSleepEvent e);
}
