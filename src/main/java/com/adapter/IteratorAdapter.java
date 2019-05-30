package com.adapter;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * @Author zp
 * @create 2019/5/27 16:55
 */
public class IteratorAdapter implements Enumeration {
    Iterator i;

    public IteratorAdapter(Iterator i) {
        this.i = i;
    }

    public boolean hasMoreElements() {
        return i.hasNext();
    }

    public Object nextElement() {
        return i.next();
    }
}
