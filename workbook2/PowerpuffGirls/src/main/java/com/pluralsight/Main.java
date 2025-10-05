package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        // Todo: Powerpuff fighting game
        //Features
        //Play online, play solo

        // Customizing Characters
        //Customes
        //Finishing Moves
        //Team attack
        //Dialogue
        //Health boost

        PowerpuffGirls blossom = new PowerpuffGirls("Blossom","pink");
        System.out.println(blossom.getHealth());

        blossom.setHealth(40);
        System.out.println(blossom.getHealth());
        blossom.Heal(30);
    }
}
