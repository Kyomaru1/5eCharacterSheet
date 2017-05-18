package com.kyostudios.a5echaractersheet;

/**
 * Created by Kyoma on 2/8/2017.
 */

public class StatsSpread {
    public StatsSpread(int[] scores, int proficiencyBonus, boolean[] savingThrowProficiencies, boolean[] skillProficiencies){
        setScores(scores);
        setModifiers(returnScoreBonuses(scores));
        setProficiencyBonus(proficiencyBonus);
        setSavingThrowProficiencies(savingThrowProficiencies);
        setSavingThrowScores(returnProficientScoreBonuses(scores, savingThrowProficiencies));
        setSkillProficienciesS(skillProficiencies);
        setSkillScores(returnProficientScoreBonuses(scores, skillProficiencies));
        setPassivePerception(10 + proficiencyBonus);
    }

    public int[] getScores() {
        return scores;
    }

    private int[] scores;

    public int[] getModifiers() {
        return modifiers;
    }

    public int getProficiencyBonus() {
        return proficiencyBonus;
    }

    public boolean[] getSavingThrowProficiencies() {
        return savingThrowProficiencies;
    }

    public int[] getSavingThrowScores() {
        return savingThrowScores;
    }

    public boolean[] getSkillProficiencies() {
        return skillProficiencies;
    }

    public int[] getSkillScores() {
        return skillScores;
    }

    public int getPassivePerception() {
        return passivePerception;
    }

    private int[] modifiers;
    private int proficiencyBonus;
    private boolean[] savingThrowProficiencies;
    private int[] savingThrowScores;
    private boolean[] skillProficiencies;
    private int[] skillScores;
    private int passivePerception;

    public void setScores(int[] scores){
        this.scores = scores;
    }

    public void setModifiers(int[] modifiers){
        this.modifiers = modifiers;
    }

    public void setProficiencyBonus(int bonus){
        this.proficiencyBonus = bonus;
    }

    public void setSavingThrowProficiencies(boolean[] stp){this.savingThrowProficiencies = stp;}

    public void setSavingThrowScores(int[] scores){
        this.savingThrowScores = scores;
    }

    public void setSkillProficienciesS(boolean[] skp){
        this.skillProficiencies = skp;
    }

    public void setSkillScores(int[] scores){
        this.skillScores = scores;
    }

    public void setPassivePerception(int passivePerception){
        this.passivePerception = passivePerception;
    }

    private int[] returnScoreBonuses(int[] scores){
        int[] bonuses = new int[5];
        for(int i = 0; i <= scores.length; i++){
            double currentScore = (double)scores[i];

            bonuses[i] = (int)Math.floor((currentScore - 10)/2);
        }

        return bonuses;
    }

    private int[] returnProficientScoreBonuses(int[] scores, boolean[] proficiencies){
        int[] bonuses = new int[5];
        for(int i = 0; i <= scores.length; i++){
            double currentScore = (double)scores[i];

            bonuses[i] = (int)Math.floor((currentScore - 10)/2);
            if(proficiencies[i]){
                bonuses[i] += proficiencyBonus;
            }
        }

        return bonuses;
    }
}
