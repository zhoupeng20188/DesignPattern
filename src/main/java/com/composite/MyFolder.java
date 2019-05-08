package com.composite;

import java.util.ArrayList;
import java.util.List;

public class MyFolder implements IFile {
    private String name;
    private List<IFile> children = new ArrayList<IFile>();

    MyFolder(String name){
        this.name= name;
    }
    public void display() {
        System.out.println(this.name);
    }

    public void add(IFile file) {
        children.add(file);
    }

    public List<IFile> getChildren() {
        return children;
    }
}
