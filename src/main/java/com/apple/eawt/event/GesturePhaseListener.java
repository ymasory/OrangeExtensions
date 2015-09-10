package com.apple.eawt.event;

public abstract interface GesturePhaseListener extends GestureListener
{
    public abstract void gestureBegan(GesturePhaseEvent paramGesturePhaseEvent);

    public abstract void gestureEnded(GesturePhaseEvent paramGesturePhaseEvent);
}
