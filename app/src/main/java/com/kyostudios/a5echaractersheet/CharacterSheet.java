package com.kyostudios.a5echaractersheet;

/**
 * Created by Kyoma on 2/8/2017.
 */

public class CharacterSheet {

    public CharacterSheet(String name, String charClass, String race, String alignment, StatsSpread stats, int ac, int init, int speed, int[] hp, int tempHP, HitDie[] hitDie, boolean[] deathSaves, boolean[]failures,
                          Weapon[] weapons){

        //firstPageSetup
        setCharacterName(name);
        setCharacterClass(charClass);
        setRace(race);
        setAlignment(alignment);
        setStats(stats);
        setArmorClass(ac);
        setInitiative(init);
        setSpeed(speed);
        setHitPoints(hp);
        setTempHitPoints(tempHP);
        setHitDie(hitDie);
        setDeathSaves(deathSaves);
        setFailures(failures);
        setWeapons(weapons);
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    public StatsSpread getStats() {
        return stats;
    }

    public void setStats(StatsSpread stats) {
        this.stats = stats;
    }

    public int getArmorClass() {
        return armorClass;
    }

    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }

    public int getInitiative() {
        return initiative;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int[] getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int[] hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getTempHitPoints() {
        return tempHitPoints;
    }

    public void setTempHitPoints(int tempHitPoints) {
        this.tempHitPoints = tempHitPoints;
    }

    public HitDie[] getHitDie() {
        return hitDie;
    }

    public void setHitDie(HitDie[] hitDie) {
        this.hitDie = hitDie;
    }

    public boolean[] getDeathSaves() {
        return deathSaves;
    }

    public void setDeathSaves(boolean[] deathSaves) {
        this.deathSaves = deathSaves;
    }

    public boolean[] getFailures() {
        return failures;
    }

    public void setFailures(boolean[] failures) {
        this.failures = failures;
    }

    public Weapon[] getWeapons() {
        return weapons;
    }

    public void setWeapons(Weapon[] weapons) {
        this.weapons = weapons;
    }

    //First Page
    private String characterName;
    private String characterClass;
    private String race;
    private String alignment;
    private StatsSpread stats;
    private int armorClass;
    private int initiative;
    private int speed;
    private int[] hitPoints;
    private int tempHitPoints;
    private HitDie[] hitDie;
    private boolean[] deathSaves;
    private boolean[] failures;
    private Weapon[] weapons;

    //Second Page


    //Third Page

}
