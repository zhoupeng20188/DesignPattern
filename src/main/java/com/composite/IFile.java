package com.composite;

import java.util.List;

public interface IFile {
    //显示文件或文件夹的名称
    void display();
    // 添加
    void add(IFile file);
    //获取子节点
    List<IFile> getChildren();
}
