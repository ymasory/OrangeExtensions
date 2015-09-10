package com.apple.eawt.event;
 
import javax.swing.JComponent;
 
public final class GestureUtilities
{
    static RuntimeException unimplemented()
    {
        return new RuntimeException("Unimplemented");
    }
 
    GestureUtilities() {
        unimplemented();
    }
 
    public static void addGestureListenerTo(JComponent paramJComponent, GestureListener paramGestureListener) {
        unimplemented();
    }
 
    public static void removeGestureListenerFrom(JComponent paramJComponent, GestureListener paramGestureListener) {
        unimplemented();
    }
}
