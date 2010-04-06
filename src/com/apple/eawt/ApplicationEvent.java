package com.apple.eawt;

import java.util.EventObject;

public class ApplicationEvent extends EventObject {

    ApplicationEvent(Object source) {
        super(source);
    }

    ApplicationEvent(Object source, String str) {
        super(source);
    }

	public String getFilename() {
        return null;
    }

    public boolean isHandled() {
        return false;
    }

    public void setHandled(boolean state) {}
}
