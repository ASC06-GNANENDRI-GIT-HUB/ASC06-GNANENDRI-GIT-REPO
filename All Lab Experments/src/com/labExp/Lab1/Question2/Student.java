package com.labExp.Lab1.Question2;

class Student {
    private int id;
    private String Name;
    private String city;
    private int marks1;
    private int marks2;
    private int marks3;

    float feePerMonth;
    boolean isEligibleForScholarship;

    //getters and setters
public void setName(String Name){
this.Name = Name;
}
public  String getName(){
    return Name;
}
public void setId(int id){
    this.id = id;
}
public int getId(){
    return id;
}
public  void setCity(String city){
    this.city = city;
}
public String getCity(){
    return city;
}
public  void setMarks1(int marks1){
this.marks1=marks1;
}
public int getMarks1(){
return marks1;
}
public  void setMarks2(int marks2){
    this.marks2=marks2;
    }
    public int getMarks2(){
        return marks2;
}
    public  void setMarks3(int marks3){
        this.marks3=marks3;
    }
    public int getMarks3() {
        return marks3;
    }
    public void setFeePerMonth(int feePerMonth){
this.feePerMonth = feePerMonth;
}
public float getFeePerMonth(){
    return feePerMonth;
}
public void setEligibleForScholarship(boolean isEligibleForScholarship){
    this.isEligibleForScholarship = isEligibleForScholarship;
    }
    public boolean getEligibleForScholarship(){
    return isEligibleForScholarship;
    }

    // given methods
    public void setAnnualFee() {
        this.feePerMonth = feePerMonth;
    }


    public float getAnnualFee(){
    return feePerMonth * 12;
    }


    public void setTotalMarks(int marks1, int marks2, int marks3){
    this.marks1 = marks1;
    this.marks2 = marks2;
    this.marks3 = marks3;
}

public int getTotalMarks(){
    return marks1 + marks2+ marks3;
}
    public int getAverage() {
        return (marks1 + marks2 + marks3) / 3;
    }
public void setResult(int marks1, int marks2, int marks3){
    this.marks1 = marks1;
    this.marks2 = marks2;
    this.marks3 = marks3;
}
public String getResult(){
    if(marks1>=60 && marks2>=60 && marks3>=6){
        return "Pass";
    }
    return "false";
}
}
class Main{
public static void main(String args[]){
    Student s1 = new Student();
    s1.setName("Gnani");
    s1.setId(101);
    s1.setCity("Banglore");
    s1.setMarks1(95);
    s1.setMarks2(90);
    s1.setMarks3(80);
    s1.setFeePerMonth(450);
    s1.setEligibleForScholarship(true);

    Student s2 = new Student();
    s2.setName("Bavi");
    s2.setId(102);
    s2.setCity("Tumkur");
    s2.setMarks1(80);
    s2.setMarks2(90);
    s2.setMarks3(95);
    s2.setFeePerMonth(400);
    s1.setEligibleForScholarship(false);

    System.out.println(s1.getAnnualFee());
    System.out.println(s1.getTotalMarks());
    System.out.println(s1.getAverage());
    System.out.println(s1.getResult());

    System.out.println(s2.getAnnualFee());
    System.out.println(s2.getTotalMarks());
    System.out.println(s2.getAverage());
    System.out.println(s2.getResult());
}
}


