package com.example;
import java.lang.Math;

public class Trojkat extends Figura {

    double bok;

    public Trojkat(double bok){
        this.bok = bok;
        obliczpole(bok);
        obliczceche(bok);
    }

    public void obliczpole(double bok){
        pole = (float)( Math.pow(bok,2) * Math.sqrt(3) ) / 4;
    }

    public void obliczceche(double bok){
        wysokosc = (float)( bok * Math.sqrt(3) ) / 2;
    }

}
