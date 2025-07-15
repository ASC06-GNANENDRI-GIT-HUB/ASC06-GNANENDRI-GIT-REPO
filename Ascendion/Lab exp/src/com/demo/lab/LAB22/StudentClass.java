package com.demo.lab.LAB22;

import jdk.management.resource.internal.TotalResourceContext;

public class StudentClass {
        private int id;
        private String Name;
        private String city;
        private int m1, m2, m3;
        private float feePerMonth;
        private boolean EligibleForScholarship;

        // defining set and get
        public void setStudentId(int studentid) {
            studentid = id;
        }

        public void getStudentId() {
            System.out.println("StudentId :" + id);
        }

        //name
        public void setStudentName(String studentName) {
            studentName = Name;
        }

        public void getStudentName() {
            System.out.println("StudentName :" + Name);
        }

        //city
        public void setStudentcity(String Studentcity) {
            Studentcity = city;
        }

        public void getStudentcity() {
            System.out.println("Studentcity :" + city);
        }

        //marks
        public void setmarksm1(int marksm1) {
            marksm1 = m1;
        }

        public void getmarksm1() {
            System.out.println("marksm1 :" + m1);
        }

        public void setmarksm2(int marksm2) {
            marksm2 = m2;
        }

        public void getmarksm2() {
            System.out.println("marksm2 :" + m2);
        }

        public void setmarksm3(int marksm3) {
            marksm3 = m3;
        }

        public void getmarksm3() {
            System.out.println("marksm3 :" + m3);
        }

        // fee per month
        public void setfeeMonth(float feeMonth) {
            feeMonth = feePerMonth;
        }

        public void getfeeMonth() {
            System.out.println("feePeMonth :" + feePerMonth);
        }

        // EligibleForScholarship
        public void setEligibleScholarship(boolean EligibleScholarship) {
            EligibleScholarship = EligibleForScholarship;
        }

        public void getEligibleScholarship() {
            System.out.println("EligibleScholarship :" + EligibleForScholarship);
        }

        public void getAnnualFee(){
            System.out.println("Annual Fee : " + (feePerMonth * 12));
        }
        public void gettotal(){
            int Total = m1+m2+m3;
            System.out.println("total marks: " + Total);
        }
        public void getaverage(){
            float average = (m1+m2+m3)/3.0f;
            System.out.println("AverageofMarks: " + average);
        }
        public void getresult(){
            if(m1>60 && m2>60 && m3>60 ){
                System.out.println("Result : pass");
            }
            else{
                System.out.println("Result : Fail");
            }
        }
        public void getStudentDetails(){
            System.out.println("Student Details");
            System.out.println("Student Name : " + Name);
            gettotal();
            getaverage();
            getAnnualFee();
            getresult();
            System.out.println("Eligible for Scholarship:" + EligibleForScholarship);
        }
    }








