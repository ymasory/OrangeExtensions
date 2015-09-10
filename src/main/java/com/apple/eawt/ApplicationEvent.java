package com.apple.eawt;
 
import java.util.EventObject;
 
@Deprecated
public class ApplicationEvent extends EventObject
{
    ApplicationEvent(Object paramObject)
    {
        super(paramObject);
        throw Application.unimplemented();
    }
 
    ApplicationEvent(Object paramObject, String paramString) {
        super(paramObject);
        throw Application.unimplemented();
    }
 
    @Deprecated
    public boolean isHandled() {
        throw Application.unimplemented();
    }
 
    @Deprecated
    public void setHandled(boolean paramBoolean) {
        throw Application.unimplemented();
    }
 
    @Deprecated
    public String getFilename() {
        throw Application.unimplemented();
    }
}
