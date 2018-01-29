package com.udacity.gradle.builditbigger.backend;


/** The object model for the data we are sending through endpoints */
public class MyBean {

    public String myJoke;

    public String getData() {
        return myJoke;
    }

    public void setData(String myJoke) {
        this.myJoke = myJoke;
    }
}