package com.apple.eawt;

import java.awt.Canvas;
import java.awt.Dimension;

public abstract class CocoaComponent extends Canvas {
	
	public CocoaComponent() {}

	@Deprecated
    public abstract int createNSView();

    public long createNSViewLong() {
        return 0L;
    }

    @Override
	public abstract Dimension getMaximumSize();

    @Override
	public abstract Dimension getMinimumSize();

    @Override
	public abstract Dimension getPreferredSize();
    
    public final void sendMessage(int messageID, Object message) {}
}
