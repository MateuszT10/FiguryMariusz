package com.example;
import java.lang.Math;

public class Kolo extends Figura {

    double promien;

    public Kolo(double promien){
        this.promien = promien;
        obliczpole(promien);
    }

    public void obliczpole(double promien){
        pole = Math.PI * Math.pow(promien,2);
    }

    public void obliczceche(double promien){
        srednica = promien * 2;
    }

}
