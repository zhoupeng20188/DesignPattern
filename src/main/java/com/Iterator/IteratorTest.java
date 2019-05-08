package com.Iterator;

import java.util.Iterator;

public class IteratorTest {

    public static void main(String[] args) {

        Book book = new Book("dddfdsf111", "sdfsd");
        Book book2 = new Book("dddfdsf222", "sdf3eee");
        BookList bookList = new BookList();
        bookList.add(book);
        bookList.add(book2);
//        while(bookList.hasNext()){
//            System.out.println(bookList.getNext().getIsbn());
//        }
        Iterator iterator  =bookList.getIterator();
        while (iterator.hasNext()) {
            Book next = (Book)iterator.next();
            System.out.println(next.getIsbn());
        }
    }

}
