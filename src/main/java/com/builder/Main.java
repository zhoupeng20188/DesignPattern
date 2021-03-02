package com.builder;

public class Main {
    public static void main(String[] args) {
        User u = User.Builder.get()
                .withAccount("123")
                .withAddr("湖北省武汉市")
                .withName("test001")
                .build();
        System.out.println(u);
    }
}
