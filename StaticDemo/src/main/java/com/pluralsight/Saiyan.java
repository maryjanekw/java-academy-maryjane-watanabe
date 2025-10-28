package com.pluralsight;

import java.util.ArrayList;

public class Saiyan {

    // instance variables  unique for any saiyans
    private String name;
    private int powerlevel;

    // static variable - shared by ALL Saiyans
    private static int totalSaiyans = 0;

    static ArrayList<Saiyan> allSaiyans = new ArrayList<>();

    public Saiyan(String _name, int _powerlevel) {
        this.name = _name;
        this.powerlevel = _powerlevel;
        totalSaiyans++; // One extra saiyan has been created +1
        allSaiyans.add(this);
    }

    // Static — the total count is shared; it belongs to the class, not one object
    public static void showTotalSaiyans() {
        System.out.println("The total amount of saiyans is:" + totalSaiyans);
    }

    // Non-static — each Saiyan object has its own power level
    public void setPowerlevel(int powerlevel) {
        if(powerlevel > 0) {
            this.powerlevel = powerlevel;
        }
    }

    public static void showAllSaiyansStats(){
        for (Saiyan s : allSaiyans)
        {
            s.showStat();
        }
    }

    //show stats for specific Saiyan
    public void showStat(){
        //non-static is values that belongs to the object
        // static mean generic information not a particilar saiyan or object.
        System.out.println("Name: " + this.name);
        System.out.println("Power lavel: " + this.powerlevel + "\n");

    }

    //  Non-static — each warrior trains differently, so it’s tied to the instance.
    void gravityChamber() {
        System.out.println("Training under 300x gravity!");
    }

    // Static — the planet name belongs to the class and is shared by all Saiyans.
    static String planetName = "Earth";

    // Static — the method acts on multiple objects, not a single instance
    static void fusionDance(Saiyan s1, Saiyan s2) {
        System.out.println(s1 + " and " + s2 + " fused into Gogeta!");
    }
}
