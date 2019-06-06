package com.java.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @Author zp
 * @create 2019/6/6 16:03
 */
public interface MyService extends Remote {
    public String hello() throws RemoteException;
}
