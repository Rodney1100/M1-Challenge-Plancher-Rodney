package com.company;

public class Constable extends Character{

    boolean jurisdiction;

    public Constable() {
        super();
        this.setStrength(60);
        this.setHealth(100);
        this.setStamina(60);
        this.setSpeed(20);
        this.setAttackPower(5);
        this.setRunning(false);
        this.setArrested(false);
    }

    public boolean getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(boolean jurisdiction) {
        this.jurisdiction = jurisdiction;
    }
}
