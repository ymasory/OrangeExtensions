package com.apple.eawt;
 
public abstract class FullScreenAdapter
    implements FullScreenListener
{
    public void windowEnteringFullScreen(AppEvent.FullScreenEvent paramFullScreenEvent)
    {
        throw Application.unimplemented(); } 
    public void windowEnteredFullScreen(AppEvent.FullScreenEvent paramFullScreenEvent) { throw Application.unimplemented(); } 
    public void windowExitingFullScreen(AppEvent.FullScreenEvent paramFullScreenEvent) { throw Application.unimplemented(); } 
    public void windowExitedFullScreen(AppEvent.FullScreenEvent paramFullScreenEvent) { throw Application.unimplemented(); }
 
}
