package com.apple.eawt.event;

public abstract interface MagnificationListener extends GestureListener
{
    public abstract void magnify(MagnificationEvent paramMagnificationEvent);
}
