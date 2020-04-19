package com.AmazingRabbit.fivecombat.event;

public class WarEffort {

    int warEffort;

    public WarEffort(){
    }

    public void setWarEffort(int effort){
        warEffort = effort;
    }

    public void addWarEffort(int num){
        warEffort = warEffort+num;
    }

    public int getWarEffort(){
        return warEffort;
    }

}
