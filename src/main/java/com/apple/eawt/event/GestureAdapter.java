package com.apple.eawt.event;
 
public abstract class GestureAdapter
    implements GesturePhaseListener, MagnificationListener, RotationListener, SwipeListener
{
    public void gestureBegan(GesturePhaseEvent paramGesturePhaseEvent)
    {
        GestureUtilities.unimplemented(); } 
    public void gestureEnded(GesturePhaseEvent paramGesturePhaseEvent) { GestureUtilities.unimplemented(); } 
    public void magnify(MagnificationEvent paramMagnificationEvent) { GestureUtilities.unimplemented(); } 
    public void rotate(RotationEvent paramRotationEvent) { GestureUtilities.unimplemented(); } 
    public void swipedDown(SwipeEvent paramSwipeEvent) { GestureUtilities.unimplemented(); } 
    public void swipedLeft(SwipeEvent paramSwipeEvent) { GestureUtilities.unimplemented(); } 
    public void swipedRight(SwipeEvent paramSwipeEvent) { GestureUtilities.unimplemented(); } 
    public void swipedUp(SwipeEvent paramSwipeEvent) { GestureUtilities.unimplemented(); }
 
}
