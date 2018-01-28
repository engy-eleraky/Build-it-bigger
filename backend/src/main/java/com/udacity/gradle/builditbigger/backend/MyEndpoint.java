package com.udacity.gradle.builditbigger.backend;

import com.example.lib.javaLib;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import javax.inject.Named;

/** An endpoint class we are exposing */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com",
                packagePath = ""
        )
)
public class MyEndpoint {
//
//    /** A simple endpoint method that takes a name and says Hi back */
//    @ApiMethod(name = "sayHi")
//   public MyBean sayHi(@Named("name") String name) {
//
//       // public MyBean sayHi(MyBean response) {
//        MyBean response = new MyBean();
////        javaLib javaJoke=new javaLib();
////         String joke=javaJoke.tellAJoke();
//        response.setData("Hi, " + name );
//       // response.setData(joke);
//
//        return response;
//    }
    @ApiMethod(name = "sayHi")
    public MyBean sayHi() {
        MyBean response = new MyBean();
        javaLib javaJoke = new javaLib();
        response.setData(javaJoke.tellAJoke());
        return response;




    }
}
