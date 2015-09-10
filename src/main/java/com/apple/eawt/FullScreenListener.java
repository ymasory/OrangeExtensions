package com.apple.eawt;

import java.util.EventListener;

public abstract interface FullScreenListener extends EventListener
{
    public abstract void windowEnteringFullScreen(AppEvent.FullScreenEvent paramFullScreenEvent);

    public abstract void windowEnteredFullScreen(AppEvent.FullScreenEvent paramFullScreenEvent);

    public abstract void windowExitingFullScreen(AppEvent.FullScreenEvent paramFullScreenEvent);

    public abstract void windowExitedFullScreen(AppEvent.FullScreenEvent paramFullScreenEvent);
}

