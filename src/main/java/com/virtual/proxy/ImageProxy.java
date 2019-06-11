package com.virtual.proxy;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * @Author zp
 * @create 2019/6/11 10:39
 */
public class ImageProxy implements Icon {
    ImageIcon imageIcon;
    URL imageUrl;
    Thread retrievalThread;
    boolean retrieving = false;

    public ImageProxy(URL imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getIconWidth() {
        if (imageIcon != null) {
            return imageIcon.getIconWidth();
        }
        return 800;
    }

    public int getIconHeight() {
        if (imageIcon != null) {
            return imageIcon.getIconHeight();
        }
        return 600;
    }

    public void paintIcon(final Component c, Graphics g, int x, int y) {
        System.out.println("function paintIcon in..");
        if (imageIcon != null) {
            imageIcon.paintIcon(c, g, x, y);
        } else {
            g.drawString("loading iamge.....", x + 300, y + 190);
            if (!retrieving) {
                retrieving = true;
                retrievalThread = new Thread(new Runnable() {
                    public void run() {
                        System.out.println("启动线程");
                        imageIcon = new ImageIcon(imageUrl, "CD Cover");
                        c.repaint();
                    }
                });
                retrievalThread.start();
            }
        }
    }

}
