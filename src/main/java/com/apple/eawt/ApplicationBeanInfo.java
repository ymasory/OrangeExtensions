package com.apple.eawt;
 
import java.awt.Image;
import java.awt.Toolkit;
import java.beans.SimpleBeanInfo;
 
public class ApplicationBeanInfo extends SimpleBeanInfo
{
    public Image getIcon(int paramInt)
    {
        return Toolkit.getDefaultToolkit().getImage("NSImage://NSGenericApplication");
    }
}
