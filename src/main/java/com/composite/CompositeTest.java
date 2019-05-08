package com.composite;

import java.util.List;

public class CompositeTest {
    public static void main(String[] args) {
        MyFolder myFolder = new MyFolder("f1");
        MyFile myFile1 = new MyFile("a1");
        MyFile myFile2 = new MyFile("a2");
        MyFile myFile3 = new MyFile("a3");
        MyFile myFile4 = new MyFile("a4");
        MyFile myFile5 = new MyFile("a5");
        MyFile myFile6 = new MyFile("a6");
        MyFolder myFolder2 = new MyFolder("f2");
        MyFolder myFolder3 = new MyFolder("f3");
        MyFolder myFolder4 = new MyFolder("f4");
        myFolder.add(myFile1);
        myFolder.add(myFolder2);
        myFolder.add(myFolder4);
        myFolder4.add(myFile3);
        myFolder2.add(myFile2);
        myFolder2.add(myFolder3);
        myFolder3.add(myFile4);
        myFolder3.add(myFile5);
        myFolder3.add(myFile6);
        treeDisplay(myFolder,0);
    }

    public static void treeDisplay(IFile root, int num){
        for (int i = 0; i < num ; i++) {
            System.out.print("--");
        }
        if(root instanceof MyFile) {
            root.display();
        } else {
            root.display();
            List<IFile> children = root.getChildren();
            for (IFile child:children) {
                treeDisplay(child, num + 1);
            }
        }
    }
}
