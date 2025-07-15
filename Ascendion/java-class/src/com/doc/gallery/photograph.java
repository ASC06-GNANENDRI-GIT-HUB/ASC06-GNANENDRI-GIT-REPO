package com.doc.gallery;

public class photograph {
    byte framewidth;
    String colorphoto;
    String framematerial;
    String name;

    void hang(){
        System.out.println("Hang on the rare wall");
    }
    void changeorientation(String orientation){
        System.out.println("orientation changed to :" + orientation);
    }
    boolean illuminate(){
        System.out.println("switched on!");
          return true;
    }
    void autograph(){
        System.out.println("Autograph sign");
    }
}
