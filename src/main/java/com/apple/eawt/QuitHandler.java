package com.apple.eawt;

public abstract interface QuitHandler
{
    public abstract void handleQuitRequestWith(AppEvent.QuitEvent paramQuitEvent, QuitResponse paramQuitResponse);
}
