package com.demo.lab.LAB1;

public class one {
    public void add(int a, int b) {
        System.out.println(a+b);
    }
    public void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
    public void add(double a, double b){
        System.out.println(a+b);
    }
    public void add(String a, int b){
        System.out.println(a + " "+ b);
    }
   public static void main(String[] args) {
       one demo = new one();
       demo.add(3, 4);
       demo.add(5, 8, 1);
       demo.add(2.14, 3.65);
       demo.add("hello", 2);
    }
}
