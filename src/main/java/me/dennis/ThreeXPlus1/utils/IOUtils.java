package me.dennis.ThreeXPlus1.utils;

public class IOUtils {
    public static void pressAnyKeyToContinue(int code)
    {
        System.out.println("Press enter to continue...");
        try
        {
            System.in.read();
            System.exit(code);
        }
        catch(Exception ignored)
        {}
    }
}
