package com.adapter;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * @Author zp
 * @create 2019/5/27 16:52
 */
public class EnumerationAdapter implements Iterator {
    Enumeration e;

    public EnumerationAdapter(Enumeration e) {
        this.e = e;
    }

    public boolean hasNext() {
        return e.hasMoreElements();
    }

    public Object next() {
        return e.nextElement();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
