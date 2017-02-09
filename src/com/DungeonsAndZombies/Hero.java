package com.DungeonsAndZombies;


public class Hero {
    private String name;
    private String title;
    private int health;
    private int mana;
    private int manaRegenRate;

    Hero(String name, String title, int health, int mana, int manaRegenRate){

        this.name = name;
        this.title = title;
        this.health = health;
        this.mana = mana;
        this.manaRegenRate = manaRegenRate;
    }

    public String getName(){
        return this.name;
    }

    public String getTitle(){
        return this.title;
    }

    public int getHealth() {
        return this.health;
    }

    public int getManaRegenRate() {
        return this.manaRegenRate;
    }

    public int getMana() {
        return this.mana;
    }

    public String knownAs(){
        return this.getName() + " the " + this.getTitle();
    }


}
