package com.bmi.demo;

public class AnayzelBMI {
    private HumanBegin human;

    public String anayzel(float height,float weight){
        this.human = new HumanBegin(height,weight);    
        float bmi = this.human.getBmi();
        if (bmi <= 18.5 && bmi > 0) {
            return "ผอมเกินไป";
        }else if(bmi >= 18.6 && bmi <=  24.0){
            return "น้ำหนักปกติ";
        }else if(bmi >= 25.0  && bmi <=  29.9){
            return"อ้วน";
        }else{
            return"อ้วนมาก";
        }
    }
}
