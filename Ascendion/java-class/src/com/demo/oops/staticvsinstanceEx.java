package com.demo.oops;

public class staticvsinstanceEx {
    public static void main(String[] args){
        Employee.companyname = "The Amazing company";
        System.out.println(Employee.companyName);
    }
}