package com.apple.eawt;
 
@Deprecated
public class ApplicationAdapter
    implements ApplicationListener
{
    public ApplicationAdapter()
    {
        throw Application.unimplemented();
    }
    @Deprecated
    public void handleAbout(ApplicationEvent paramApplicationEvent) {
        throw Application.unimplemented();
    }
    @Deprecated
    public void handleOpenApplication(ApplicationEvent paramApplicationEvent) { throw Application.unimplemented(); } 
    @Deprecated
    public void handleOpenFile(ApplicationEvent paramApplicationEvent) {
        throw Application.unimplemented();
    }
    @Deprecated
    public void handlePreferences(ApplicationEvent paramApplicationEvent) { throw Application.unimplemented(); } 
    @Deprecated
    public void handlePrintFile(ApplicationEvent paramApplicationEvent) {
        throw Application.unimplemented();
    }
    @Deprecated
    public void handleQuit(ApplicationEvent paramApplicationEvent) { throw Application.unimplemented(); } 
    @Deprecated
    public void handleReOpenApplication(ApplicationEvent paramApplicationEvent) {
        throw Application.unimplemented();
    }
}
