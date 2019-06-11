package com.virtual.proxy;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

/**
 * @Author zp
 * @create 2019/6/11 11:07
 */
public class ImageProxyTestDrive {
    ImageComponent imageComponent;
    JFrame frame = new JFrame("CD Cover Viewer");
    JMenuBar jMenuBar;
    JMenu jMenu;
    Hashtable urls = new Hashtable();

    public ImageProxyTestDrive() throws MalformedURLException {
        urls.put("image1","http://cms-bucket.ws.126.net/2019/06/10/41295040fedf47068ff99299c3c7392a.jpeg?imageView&thumbnail=648y402");
        urls.put("image2","https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1560233618075&di=cc19d67fabd1d93959806624770dc5ec&imgtype=0&src=http%3A%2F%2Fimg.zcool.cn%2Fcommunity%2F01f6ee5a33aae8a80121db80da257f.jpg%402o.jpg");
        URL initialUrl = new URL((String) urls.get("image1"));
        jMenuBar = new JMenuBar();
        jMenu = new JMenu("Favorite CDs");
        jMenuBar.add(jMenu);
        frame.setJMenuBar(jMenuBar);
        Icon icon = new ImageProxy(initialUrl);
        Enumeration keys = urls.keys();
        while (keys.hasMoreElements()){
            String next = (String) keys.nextElement();
            JMenuItem jMenuItem = new JMenuItem(next);
            jMenu.add(jMenuItem);
            jMenuItem.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    imageComponent.setIcon(new ImageProxy(getUrl(e.getActionCommand())));
                    frame.repaint();
                }
            });
        }
        imageComponent = new ImageComponent(icon);
        frame.getContentPane().add(imageComponent);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        frame.setVisible(true);
    }

    URL getUrl(String name){
        try {
            return new URL((String) urls.get(name));
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
