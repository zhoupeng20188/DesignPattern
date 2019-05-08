package com.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookList {
    private List<Book> list = new ArrayList<Book>();
    private int index;

    public void add(Book book) {
        list.add(book);
    }

    //    public boolean hasNext() {
//        if(index >= list.size()){
//            return false;
//        }
//        return  true;
//    }
//    public Book getNext(){
//        return list.get(index++);
//    }

    public Iterator getIterator(){
        return new iter();
    }
    private class iter implements Iterator {

        public boolean hasNext() {
            if (index >= list.size()) {
                return false;
            }
            return true;
        }

        public Object next() {
            return list.get(index++);
        }

        public void remove() {

        }
    }
}
