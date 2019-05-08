package com.composite;

import java.util.List;

public class MyFile implements IFile {
    private String name;
    MyFile(String name){
        this.name =name;
    }
    public void display() {
        System.out.println(this.name);
    }

    public void add(IFile file) {
    }

    public List<IFile> getChildren() {
        return null;
    }
}
