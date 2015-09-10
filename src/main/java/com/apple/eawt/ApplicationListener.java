package com.apple.eawt;

import java.util.EventListener;

@Deprecated
public abstract interface ApplicationListener extends EventListener
{
  @Deprecated
  public abstract void handleAbout(ApplicationEvent paramApplicationEvent);

  @Deprecated
  public abstract void handleOpenApplication(ApplicationEvent paramApplicationEvent);

  @Deprecated
  public abstract void handleOpenFile(ApplicationEvent paramApplicationEvent);

  @Deprecated
  public abstract void handlePreferences(ApplicationEvent paramApplicationEvent);

  @Deprecated
  public abstract void handlePrintFile(ApplicationEvent paramApplicationEvent);

  @Deprecated
  public abstract void handleQuit(ApplicationEvent paramApplicationEvent);

  @Deprecated
  public abstract void handleReOpenApplication(ApplicationEvent paramApplicationEvent);
}
