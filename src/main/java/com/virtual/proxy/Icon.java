package com.virtual.proxy;

import java.awt.*;

/**
 * @Author zp
 * @create 2019/6/11 10:38
 */
public interface Icon {
    public int getIconWidth();
    public int getIconHeight();
    public void paintIcon(final Component c, Graphics g, int x, int y);
}
