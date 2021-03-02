package com.builder;

public class User {
    private String name;
    private String addr;
    private int age;
    private int sex;
    private String account;
    private String idCard;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", addr='" + addr + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", account='" + account + '\'' +
                ", idCard='" + idCard + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public static class Builder{
        private User user = new User();
        public static Builder get(){
            return new Builder();
        }

        public Builder withAccount(String account){
            user.setAccount(account);
            return this;
        }
        public Builder withAddr(String addr){
            user.setAddr(addr);
            return this;
        }
        public Builder withName(String name) {
            user.setName(name);
            user.setAge(18);
            user.setSex(0);
            return this;
        }

        public User build(){
            return user;
        }
    }
}
