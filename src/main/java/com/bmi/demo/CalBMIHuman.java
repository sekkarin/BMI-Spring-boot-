package com.bmi.demo;

public class CalBMIHuman {
    public HumanBegin human;

    public float calBmi(float height, float weight) {
        this.human = new HumanBegin(height, weight);
        return this.human.getBmi();

    }
}
