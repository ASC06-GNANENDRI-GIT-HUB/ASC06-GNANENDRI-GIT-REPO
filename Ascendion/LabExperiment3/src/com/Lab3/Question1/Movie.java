package com.Lab3.Question1;

public class Movie {
    private String moviename;
    private String producedBy;
    private String directedBy;
    private  int duration;
    private int year;
    private String category;
    // constructor having two mandatory feild
    public Movie(String moviename,  String producedBy){
        this.moviename = moviename;
        this.producedBy = producedBy;
    }
    // constructor having all parameters
    public Movie(String moviename,String producedBy,String directedBy, int duration, int year, String category){
        this.moviename = moviename;
        this.producedBy = producedBy;
        this.directedBy = directedBy;
        this.duration = duration;
        this.year = year;
    }
    // method to accept
    public void AcceptInfo(String directedBy, int duration, int year, String category){
        this.directedBy = directedBy;
        this.duration = duration;
        this.year = year;
        this.category = category;
    }
    // method to display
    public void DisplayInfo(){
        System.out.println(" Movie Name: " + moviename);
    }


}
