package com.hasitha;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceEx1 {

    public static void main(String[] args) {
        List<String> countryList= Arrays.asList(
                "Sri lanka",
                "India",
                "Singapore",
                "Canada",
                "Australia"


        );

        //Lamda expression way
        Thread t= new Thread(()-> displayMessage());
        t.start();
        System.out.println("************************");
        //Method reference way
        Thread t2= new Thread(MethodReferenceEx1:: displayMessage);
        t2.start();
        System.out.println("************************");

        //Lamda expression way
        countryList.forEach(p->display(p));
        System.out.println("************************");

        //Method reference way
        countryList.forEach(MethodReferenceEx1::display);
        System.out.println("************************");




    }

    public static void display(String input){
        System.out.println(input);
    }

    public static void displayMessage(){
        System.out.println("hello");
    }
}
