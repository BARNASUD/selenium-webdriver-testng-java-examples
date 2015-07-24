package com.examples.java;

/**
 * Created by janesh on 7/21/2015.
 */
public class AddException  extends Exception{

    private String errorMessage = "NO ERROR";

    public AddException(String message){
        this.errorMessage = message;
    }


    public String getErrorMessage(){
        return errorMessage;
    }
}
