package com.java.rmi;

import java.rmi.Naming;

/**
 * @Author zp
 * @create 2019/6/6 16:28
 */
public class MyRemoteClient {
    public static void main(String[] args) {
        new MyRemoteClient().go();
    }

    public void go() {
        MyService myService = null;
        try {
            myService = (MyService) Naming.lookup("rmi://192.168.11.226/RemoteHello");
            String s = myService.hello();
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
