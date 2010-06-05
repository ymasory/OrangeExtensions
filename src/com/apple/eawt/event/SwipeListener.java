package com.apple.eawt.event;

/** Java for Mac OS X 10.5 Update 7, Java for Mac OS X 10.6 Update 2 */
public interface SwipeListener {

    public void swipedDown(SwipeEvent e);
    public void swipedLeft(SwipeEvent e);
    public void swipedRight(SwipeEvent e);
    public void swipedUp(SwipeEvent e);
}
