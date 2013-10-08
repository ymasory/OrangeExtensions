package com.apple.eawt.event;

/** 
 * @since 10.5 Update 7 and 10.6 Update 2
 */
public interface GesturePhaseListener extends GestureListener {
    public void gestureBegan(GesturePhaseEvent e);
    public void gestureEnded(GesturePhaseEvent e);
}
