package com.bmi.demo;

import org.springframework.web.bind.annotation.RestController;

public class HumanBegin {
    private float height;
    private float weight;
    private float bmi;

    public HumanBegin(float height,float weight){
        this.height = height;
        this.weight = weight;
        this.bmi = weight / ((height/100) * (height/100));
    }
    public float getBmi(){
        return this.bmi;
    }

}
