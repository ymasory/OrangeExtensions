package com.apple.eawt.event;

/** Java for Mac OS X 10.5 Update 7, Java for Mac OS X 10.6 Update 2 */
public abstract class GestureEvent {
    
    public void consume() {}
    protected boolean isConsumed() {
        return false;
    }
}
