package com.apple.eawt;

import java.awt.Window;
import java.io.File;
import java.net.URI;
import java.util.EventObject;
import java.util.List;

public abstract class AppEvent extends EventObject
{
    AppEvent()
    {

        super(Application.getApplication());
    }

    public static class FullScreenEvent extends AppEvent
    {
        FullScreenEvent(Window paramWindow)
        {
        }

        public Window getWindow()
        {

            throw Application.unimplemented();
        }
    }

    public static class SystemSleepEvent extends AppEvent
    {
    }

    public static class ScreenSleepEvent extends AppEvent
    {
    }

    public static class UserSessionEvent extends AppEvent
    {
    }

    public static class AppHiddenEvent extends AppEvent
    {
    }

    public static class AppForegroundEvent extends AppEvent
    {
    }

    public static class AppReOpenedEvent extends AppEvent
    {
    }

    public static class QuitEvent extends AppEvent
    {
    }

    public static class PreferencesEvent extends AppEvent
    {
    }

    public static class AboutEvent extends AppEvent
    {
    }

    public static class OpenURIEvent extends AppEvent
    {
        public URI getURI()
        {
            throw Application.unimplemented();
        }
    }

    public static class PrintFilesEvent extends AppEvent.FilesEvent
    {
    }

    public static class OpenFilesEvent extends AppEvent.FilesEvent
    {
        public String getSearchTerm()
        {
            throw Application.unimplemented();
        }
    }

    public static abstract class FilesEvent extends AppEvent
    {
        public List<File> getFiles()
        {
            throw Application.unimplemented();
        }
    }
}
