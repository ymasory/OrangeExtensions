package com.apple.eawt;

public interface AppHiddenListener extends AppEventListener {

    public void appHidden(AppEvent.AppHiddenEvent e);
    public void appUnhidden(AppEvent.AppHiddenEvent e);
}
