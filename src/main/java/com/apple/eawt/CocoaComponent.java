package com.apple.eawt;
 
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
 
public abstract class CocoaComponent extends Canvas
{
    public abstract int createNSView();
 
    public void update(Graphics paramGraphics)
    {
        throw Application.unimplemented();
    }
 
    public void paint(Graphics paramGraphics) {
        throw Application.unimplemented();
    }
 
    public long createNSViewLong() {
        throw Application.unimplemented();
    }
 
    public final void sendMessage(int paramInt, Object paramObject) {
        throw Application.unimplemented();
    }
 
    public abstract Dimension getMaximumSize();
 
    public abstract Dimension getMinimumSize();
 
    public abstract Dimension getPreferredSize();
}
