package com.labExp.Lab3.Question1;

public class Movie {
    String moviename;
    String producedBy;
    String directedBy;
    int duration;
    int year;
    String category;
    static int movieCount = 0;
    private String moviesId;

    // constructor having two mandatory feild
    public Movie(String moviename, String producedBy) {
        this.moviename = moviename;
        this.producedBy = producedBy;
        movieCount++;
    }
public static int getCount(){
        return movieCount;
    }
//method to accept or update movie info
//    public void setMovieDetails(String directedBy, int duration, int year, String category){
//        this.directedBy = directedBy;
//        this.duration = duration;
//        this.year = year;
//        this.category = category;
//    }
 //   public void getMoviesDetails()
    // method to display
    public String generateMovieId(){
        moviesId = moviename + "-" + movieCount;
        return moviesId;
    }
//    public void DisplayInfo(String moviename, String producedBy) {
//        return  moviename
//    }
    public  String showDetails(){
        return "The movie Name is " + moviename + " and movie id is " + moviesId;
    }

    public static void main(String[] args) {
        Movie movie1 = new Movie("Inception", " Emma Thomas");
        System.out.println(movie1.generateMovieId());
        System.out.println(movie1.showDetails());
        Movie movie2 = new Movie("Pushpa","Bavitha");
        System.out.println(movie2.generateMovieId());
        System.out.println(movie2.showDetails());
        Movie.getCount();
    }
}

