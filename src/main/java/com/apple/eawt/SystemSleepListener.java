package com.apple.eawt;

/** @since 10.6 Update 3 and 10.5 Update 8 */
public interface SystemSleepListener extends AppEventListener {
    public void systemAboutToSleep(AppEvent.SystemSleepEvent e);
    public void systemAwoke(AppEvent.SystemSleepEvent e);
}
