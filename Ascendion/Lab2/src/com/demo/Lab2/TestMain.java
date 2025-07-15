package com.demo.Lab2;

public class TestMain {public static void main(String[] args) {
    StudentClass s1 = new StudentClass();
    StudentClass s2 = new StudentClass();
    StudentClass s3 = new StudentClass();

    s1.setStudentId(1);
    s1.setStudentName("Gnani");
    s1.setStudentcity("Banglore");
    s1.setmarksm1(95);
    s1.setmarksm2(90);
    s1.setmarksm3(85);
    s1.setfeeMonth(3500);
    s1.setEligibleScholarship(true);


    s2.setStudentId(2);
    s2.setStudentName("Bavitha");
    s2.setStudentcity("Udupi");
    s2.setmarksm1(91);
    s2.setmarksm2(92);
    s2.setmarksm3(80);
    s2.setfeeMonth(4000);
    s2.setEligibleScholarship(true);


    s3.setStudentId(3);
    s3.setStudentName(" Pavi");
    s3.setStudentcity("Tumkur");
    s3.setmarksm1(90);
    s3.setmarksm2(80);
    s3.setmarksm3(85);
    s3.setfeeMonth(3000);
    s3.setEligibleScholarship(false);
    // find total of each student
    int total1 = s1.getmarksm1() + s1.getmarksm2() + s1.getmarksm3();
    int total2 = s2.getmarksm1() + s2.getmarksm2() + s2.getmarksm3();
    int total3 = s3.getmarksm1() + s3.getmarksm2() + s3.getmarksm3();

    StudentClass highest = s1;
    int highestTotal = total1;

    if (total2 > highestTotal) {
        highest = s2;
        highestTotal = total2;
    }
    if (total3 > highestTotal) {
        highest = s3;
        highestTotal = total3;
    }
    System.out.println("Topper of Batch: " + highest.getStudentName());
    //Least fee
    StudentClass LeastFee = s1;
    if(s2.getfeeMonth()<LeastFee.getfeeMonth()){
        LeastFee = s2;
    }
    if(s3.getfeeMonth()<LeastFee.getfeeMonth()){
        LeastFee = s3;
    }
    System.out.println("Student with least fee :" + LeastFee.getStudentName() + ", Fee : " + LeastFee.getfeeMonth());
    //Student Details
    StudentClass [] students = {s1, s2, s3};
    for(StudentClass s : students){
        s.getStudentDetails();
    }
}
}
}
