package com.kyostudios.a5echaractersheet;

/**
 * Created by Kyoma on 2/8/2017.
 */

public class Weapon {

    public Weapon(String name, String type, int bonus, String dmgDie){
        setWeaponName(name);
        setWeaponDamageType(type);
        setWeaponAtkBonus(bonus);
        setWeaponDamageType(dmgDie);
    }

    private String weaponName;
    private String weaponDamageType;
    private int weaponAtkBonus;
    private String damageDice;

    public void setWeaponName(String name){
        this.weaponName = name;
    }

    public void setWeaponDamageType(String dmgType){
        this.weaponDamageType = dmgType;
    }

    public void setWeaponAtkBonus(int atkBonus){
        this.weaponAtkBonus = atkBonus;
    }

    public void setDamageDice(Dice dmgDie){
        this.damageDice = dmgDie.getDiceType();
    }

    public String getWeaponName(){
        return this.weaponName;
    }

    public String getWeaponDamageType(){
        return this.weaponDamageType;
    }

    public String getDamageDice(){
        return this.damageDice;
    }

    public int getWeaponAtkBonus(){
        return this.weaponAtkBonus;
    }
}
