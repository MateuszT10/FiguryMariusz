package com.example;
import java.lang.Math;

public class Kwadrat extends Figura {

    float bok;

    public Kwadrat(float bok){
        this.bok = bok;
        obliczceche(bok);
        obliczpole(bok);
    }

    public void obliczpole(float bok){
        pole = (float)Math.pow(bok,2);
    }

    public void obliczceche(float bok){
        przekatna = bok * (float)Math.sqrt(2);
    }


}
