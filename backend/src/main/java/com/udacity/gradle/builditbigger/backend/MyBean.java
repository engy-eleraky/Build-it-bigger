package com.udacity.gradle.builditbigger.backend;

//import com.example.lib.javaLib;

import com.example.lib.javaLib;

/** The object model for the data we are sending through endpoints */
public class MyBean {
//    private String myData;
//
//    public String getData() {
//        return myData;
//    }
//
//    public void setData(String data) {
//        myData = data;
//    }
   // public javaLib myJoke;


//    public String getData() {
//        return myJoke.tellAJoke();
//    }
//
//    public MyBean() {
//        myJoke=new javaLib();
//    }
    public String myJoke;

    public String getData() {
        return myJoke;
    }

    public void setData(String myJoke) {
        this.myJoke = myJoke;
    }
}