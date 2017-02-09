package com.DungeonsAndZombies;


public class Hero {
    private String name;
    private String title;
    private int health;
    private int mana;
    private int manaRegenRate;
    private boolean isAlive;

    Hero(String name, String title, int health, int mana, int manaRegenRate){

        this.name = name;
        this.title = title;
        this.health = health;
        this.mana = mana;
        this.manaRegenRate = manaRegenRate;
        this.isAlive = true;
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

    public boolean isALive(){
        return this.isAlive;
    }

    public boolean isAlive(){
        return this.isAlive;
    }

    public boolean canCast(){
        //When a hero reaches mana lower than the mana needed for the spell he knows, he cannot cast any spells
        return false; //TODO Implement
    }


}
