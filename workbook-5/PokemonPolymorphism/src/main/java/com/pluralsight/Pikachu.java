package com.pluralsight;

public class Pikachu extends Pokemon{

    public Pikachu(String name){
        super(name);
    }

    @Override
    public String attack(){
        System.out.println(getName() + " attack with Thunder Bolt!");

        return "";
    }
}
