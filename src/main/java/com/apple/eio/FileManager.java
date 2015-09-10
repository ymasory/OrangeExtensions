package com.apple.eio;
 
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
 
public class FileManager
{
    public static final short kOnAppropriateDisk = -32767;
    public static final short kSystemDomain = -32766;
    public static final short kLocalDomain = -32765;
    public static final short kNetworkDomain = -32764;
    public static final short kUserDomain = -32763;
 
    static RuntimeException unimplemented()
    {
        return new RuntimeException("Unimplemented");
    }
 
    public static int OSTypeToInt(String paramString) {
        throw unimplemented();
    }
 
    public static void setFileTypeAndCreator(String paramString, int paramInt1, int paramInt2) throws IOException {
        throw unimplemented();
    }
 
    public static void setFileType(String paramString, int paramInt) throws IOException {
        throw unimplemented();
    }
 
    public static void setFileCreator(String paramString, int paramInt) throws IOException {
        throw unimplemented();
    }
 
    public static int getFileType(String paramString) throws IOException {
        throw unimplemented();
    }
 
    public static int getFileCreator(String paramString) throws IOException {
        throw unimplemented();
    }
 
    public static String findFolder(int paramInt) throws FileNotFoundException {
        throw unimplemented();
    }
 
    public static String findFolder(short paramShort, int paramInt) throws FileNotFoundException {
        throw unimplemented();
    }
 
    public static String findFolder(short paramShort, int paramInt, boolean paramBoolean) throws FileNotFoundException {
        throw unimplemented();
    }
 
    @Deprecated
    public static void openURL(String paramString) throws IOException {
        throw unimplemented();
    }
 
    public static String getResource(String paramString) throws FileNotFoundException {
        throw unimplemented();
    }
 
    public static String getResource(String paramString1, String paramString2) throws FileNotFoundException {
        throw unimplemented();
    }
 
    public static String getResource(String paramString1, String paramString2, String paramString3) throws FileNotFoundException {
        throw unimplemented();
    }
 
    public static String getPathToApplicationBundle() {
        throw unimplemented();
    }
 
    public static boolean moveToTrash(File paramFile) throws FileNotFoundException {
        throw unimplemented();
    }
 
    public static boolean revealInFinder(File paramFile) throws FileNotFoundException {
        throw unimplemented();
    }
}
