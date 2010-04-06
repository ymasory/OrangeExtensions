package com.apple.eawt;

import java.util.EventListener;

public interface ApplicationListener extends EventListener {

    public abstract void handleAbout(ApplicationEvent event);

    public abstract void handleOpenApplication(ApplicationEvent event);

    public abstract void handleOpenFile(ApplicationEvent event);

    public abstract void handlePreferences(ApplicationEvent event);

    public abstract void handlePrintFile(ApplicationEvent event);

    public abstract void handleQuit(ApplicationEvent event);

    public abstract void handleReOpenApplication(ApplicationEvent event);
}
