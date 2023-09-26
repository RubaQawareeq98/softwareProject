package org.example;

public class Main {
    public static int add(int x,int y){
        return x+y;
    }
    public static void main(String[] args) {
        Login l=new Login();
        l.setUserName("Ruba");
        l.setPassword("1234");
        System.out.println(l.isValidLogin());
    }
}