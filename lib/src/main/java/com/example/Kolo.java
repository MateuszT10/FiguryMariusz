package com.example;
import java.lang.Math;

public class Kolo extends Figura {

    float promien;

    public Kolo(float promien){
        this.promien = promien;
        obliczpole(promien);
    }

    public void obliczpole(float promien){
        pole = (float)Math.PI * (float)Math.pow(promien,2);
        obliczceche(promien);
    }

    public void obliczceche(float promien){
        srednica = promien * 2;
    }

}
