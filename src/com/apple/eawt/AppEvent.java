package com.apple.eawt;

/**
 *@Since 10.6 Update 3, Java for Mac OS X 10.5 Update 8
 */
public abstract class AppEvent extends java.util.EventObject {

    public static class AboutEvent extends AppEvent {}
    public static class AppForegroundEvent extends AppEvent {}
    public static class AppHiddenEvent extends AppEvent {}
    public static class AppReOpenedEvent extends AppEvent {}
    public static class FilesEvent extends AppEvent {}
    public static class OpenFilesEvent extends AppEvent {}
    public static class OpenURIEvent extends AppEvent {}
    public static class PreferencesEvent extends AppEvent {}
    public static class PrintFilesEvent extends AppEvent {}
    public static class QuitEvent extends AppEvent {}
    public static class ScreenSleepEvent extends AppEvent {}
    public static class SystemSleepEvent extends AppEvent {}
    public static class UserSessionEvent extends AppEvent {}
}

