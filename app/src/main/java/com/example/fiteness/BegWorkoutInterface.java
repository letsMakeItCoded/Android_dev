package com.example.fiteness;

public class BegWorkoutInterface {
    public BegWorkoutInterface(String fitnessName, String fitnessHow) {
        this.fitnessName = fitnessName;
        this.fitnessHow = fitnessHow;
    }

    String fitnessName;
    String fitnessHow;

    public String getFitnessName() {
        return fitnessName;
    }

    public String getFitnessTime() {
        return fitnessHow;
    }
}
