package com.java.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @Author zp
 * @create 2019/6/6 16:04
 */
public class MyServiceImp extends UnicastRemoteObject implements MyService {
    protected MyServiceImp() throws RemoteException {
    }

    public String hello() throws RemoteException {
        return "hello,rmi";
    }

    public static void main(String[] args) throws RemoteException, MalformedURLException {
        MyService myService = new MyServiceImp();
        Naming.rebind("RemoteHello", myService);
        System.out.println("rmi已准备就绪");
    }
}
