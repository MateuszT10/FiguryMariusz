package com.example;
import java.lang.Math;

public class Kwadrat extends Figura {

    double bok;

    public Kwadrat(double bok){
        this.bok = bok;
        obliczceche(bok);
        obliczpole(bok);
    }

    public void obliczpole(double bok){
        pole = Math.pow(bok,2);
    }

    public void obliczceche(double bok){
        przekatna = bok * Math.sqrt(2);
    }


}
