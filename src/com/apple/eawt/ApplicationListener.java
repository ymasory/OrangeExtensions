package com.apple.eawt;

import java.util.EventListener;

@deprecated
public interface ApplicationListener extends EventListener {

    @deprecated
    public void handleAbout(ApplicationEvent event);
    @deprecated
    public void handleOpenApplication(ApplicationEvent event);
    @deprecated
    public void handleOpenFile(ApplicationEvent event);
    @deprecated
    public void handlePreferences(ApplicationEvent event);
    @deprecated
    public void handlePrintFile(ApplicationEvent event);
    @deprecated
    public void handleQuit(ApplicationEvent event);
    @deprecated
    public void handleReOpenApplication(ApplicationEvent event);
}
