package com.pluralsight;

public class Jirachi extends Pokemon{

    public Jirachi(String name){
        super(name);
    }

    @Override
    public String attack(){
        System.out.println(getName() + " attack with Wish!");
        String message = "";

        return "";
    }
}
