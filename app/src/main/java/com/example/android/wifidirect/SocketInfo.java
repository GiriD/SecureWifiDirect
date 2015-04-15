package com.example.android.wifidirect;

import java.net.InetAddress;

/**
 * Created by Girish on 3/9/2015.
 */
public class SocketInfo {

    public static InetAddress getInetAddress() {
        return inetAddress;
    }

    public static void setInetAddress(InetAddress inetAddress) {
        SocketInfo.inetAddress = inetAddress;
    }

    public static InetAddress inetAddress;
}
