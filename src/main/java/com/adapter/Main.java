package com.adapter;

import java.util.*;

/**
 * @Author zp
 * @create 2019/5/27 16:56
 */
public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        Enumeration e = Collections.enumeration(list);
        EnumerationAdapter enumerationAdapter = new EnumerationAdapter(e);
        while (enumerationAdapter.hasNext()) {
            System.out.println(enumerationAdapter.next());
        }
        System.out.println("------------------------------------------------");
        Iterator i = list.iterator();
        IteratorAdapter iteratorAdapter = new IteratorAdapter(i);
        while(iteratorAdapter.hasMoreElements()){
            System.out.println(iteratorAdapter.nextElement());
        }
    }
}
