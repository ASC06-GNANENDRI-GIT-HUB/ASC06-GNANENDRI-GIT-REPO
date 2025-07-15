package com.demo.oops;

public class staticEx {
    public static void main(String[] arg){
        System.out.println(Employee1.companyname);
        System.out.println(Employee1.CEO);
        Employee1.displayCompanyDetails();
    }
}
class Employee1 {
    public static String companyname = "AZ";
    public static String CEO = "Busy!";

    public static void displayCompanyDetails(){
        System.out.println();
    }


}
