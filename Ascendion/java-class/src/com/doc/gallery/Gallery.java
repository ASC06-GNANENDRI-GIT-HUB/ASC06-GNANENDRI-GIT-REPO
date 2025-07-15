package com.doc.gallery;

class Gallery {
    public static void main(String args[]) {
        System.out.println("welcome to workden com.doc.gallery.Gallery");
        {
            photograph hdPhoto;

            hdPhoto = new photograph();
            //access the object
            //set the nmame
            //accesing the property
            hdPhoto.name = "Nandhi Hills";
            System.out.println(hdPhoto.name);
            hdPhoto.hang();
            hdPhoto.changeorientation("Landscape!");
            boolean isIlluminated = hdPhoto.illuminate();
            if (isIlluminated) {
                System.out.println("Glowing Photo!");
            }
            hdPhoto.autograph();
        }
    }
}
