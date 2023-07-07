package com.example.fiteness;

public class IntIterfaceModel {
    public IntIterfaceModel(String fitnessName, int fitnessImage) {
        this.fitnessName = fitnessName;
        this.fitnessImage = fitnessImage;
    }

    String fitnessName;
    int fitnessImage;

    public String getFitnessName() {
        return fitnessName;
    }

    public int getFitnessImage() {
        return fitnessImage;
    }
}

