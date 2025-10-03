package com.pluralsight;

public class PowerpuffGirls {

    //Instant variables (typically hidden)
    private String name;
    private int health; //(if health is <20 give message to drink health potion)
    private String outfitcolor;
    private int attackDamage;
    private int power; //(if power is <20 give message to drink power potion)

    //Consutructor (parameters with a _underscore)
    public PowerpuffGirls(String _name, String _outfitcolor) {
        this.name = _name;
        this.outfitcolor = _outfitcolor;
        this.power = 100; // default values
        this.health = 100; // default values
        this.attackDamage = 100; // default values
    }
    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int _newHealth) {
        if(_newHealth >= 0 && _newHealth <= 100) {
            this.health = _newHealth;
        } else {
            System.out.println("Come on, this is not possible. Try again!");
        }
    }

        public void Heal( int _howMuchHealth){
            System.out.println(name + " is drinking a health potion... Heals " + _howMuchHealth);
            //We cant be above 100

//            // local variable
//            int newHealth = this.health + _howMuchHealth;
//            if (newHealth >= 100) {
//                this.setHealth(100);
//                System.out.println("Fully recovered");
//            }
//            setHealth(newHealth);

            if (health >= 100) {
                System.out.println(name + "Already at full health!");
                return;
            }

            health += _howMuchHealth;
            if (health > 100) {
                health = 100;
                System.out.println(name + " Fully recovered!");
            } else {
                System.out.println(name + " Health increased to " + health);
            }

    }
}