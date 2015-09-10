package com.apple.eawt;

public abstract interface UserSessionListener extends AppEventListener
{
    public abstract void userSessionDeactivated(AppEvent.UserSessionEvent paramUserSessionEvent);

    public abstract void userSessionActivated(AppEvent.UserSessionEvent paramUserSessionEvent);
}
