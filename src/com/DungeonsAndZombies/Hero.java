package com.DungeonsAndZombies;


public class Hero extends Creature {
    private String name;
    private String title;

    private int manaRegenRate;
    private int initialHealth;
    private int initialMana;
//    private Spell heroSpell;
    private Weapon heroWeapon;

    public Hero(String name, String title, int health, int mana, int manaRegenRate){
        super(health, mana);
        this.name = name;
        this.title = title;
         this.manaRegenRate = manaRegenRate;
        this.initialHealth = health;
        this.initialMana = mana;
    }

    public String getName(){
        return this.name;
    }

    public String getTitle(){
        return this.title;
    }

    public void takeMana(){
        manaValidations();
        this.mana += this.manaRegenRate;
    }

    public int getManaRegenRate() {
        return this.manaRegenRate;
    }

//    public Spell getHeroSpell(){return this.heroSpell;}

    public Weapon getHeroWeapon(){return this.heroWeapon;};

    public void takeHealing(int healingPoints){
        this.health += healingPoints;

        if (this.health > initialHealth){
            this.health = initialHealth;
        }
    }

    public String knownAs(){
        return this.getName() + " the " + this.getTitle();
    }

    public void takeDamage(int damagePoints){
        this.health -= damagePoints;

        if (this.health < 0){
            this.health = 0;
        }

        if (this.health == 0){
            this.isAlive = false;
        }
    }

    public void moveHero(String direction){
        takeMana();

    }


    public void takeMana(int manaPoints){
        manaValidations();
        this.mana += manaPoints;
    }

    private void manaValidations(){
        if (this.mana > this.initialMana){
            this.mana = this.initialMana;
        }

        if (this.mana < 0){
            this.mana = 0;
        }
    }

    public void equip(Weapon someWeapon){
        this.heroWeapon = someWeapon;
    }

    public void learn(Spell someSpell){
        this.spell = someSpell;
    }



}
