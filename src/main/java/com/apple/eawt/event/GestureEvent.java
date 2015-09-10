package com.apple.eawt.event;
 
public abstract class GestureEvent
{
    GestureEvent()
    {
        GestureUtilities.unimplemented();
    }
 
    public void consume() {
        GestureUtilities.unimplemented();
    }
 
    protected boolean isConsumed() {
        GestureUtilities.unimplemented();
        return false;
    }
}
