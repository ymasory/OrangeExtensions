package com.apple.eawt.event;

public abstract interface SwipeListener extends GestureListener
{
    public abstract void swipedUp(SwipeEvent paramSwipeEvent);

    public abstract void swipedDown(SwipeEvent paramSwipeEvent);

    public abstract void swipedLeft(SwipeEvent paramSwipeEvent);

    public abstract void swipedRight(SwipeEvent paramSwipeEvent);
}
