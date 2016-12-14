package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    Integer N = 10;
    Figura[] figury = new Figura[N];
    float sumapolkwadratow=0;
    float sumapolkol=0;
    float sumapoltrojkatow=0;

    public List<String>   nazwafigury = new ArrayList<String>();
    public List<Float>   polefigury = new ArrayList<Float>();
    public List<Float>   cechafigury = new ArrayList<Float>();

    public static void main(String[] args) {
        Main obiekt = new Main();
        obiekt.losowanie();
    }


    void losowanie(){
        Random losowanie = new Random();
        List<Integer> wybor = new ArrayList<Integer>();
        for(int i = 0; i < N; i++) {
            wybor.add(losowanie.nextInt(3)); //wylosowanie rodzaju figury
            //losowanie figur, 0-kwadrat, 1-trojkat, 2-kolo
        }

        for(int i=0; i<N; i++){
            switch(wybor.get(i)){
                case 0:
                    figury[i] = new Kwadrat(losowanie.nextFloat());
                    nazwafigury.add("Kwadrat");
                    polefigury.add(figury[i].pole);
                    cechafigury.add(figury[i].przekatna);
                    sumapolkwadratow += figury[i].getpole();
                    System.out.format("Kwadrat o polu %.3f i przekatnej %.3f\n", figury[i].pole, figury[i].przekatna);
                    break;

                case 1:
                    figury[i] = new Trojkat(losowanie.nextFloat());
                    nazwafigury.add("Trojkat");
                    polefigury.add(figury[i].pole);
                    cechafigury.add(figury[i].wysokosc);
                    sumapoltrojkatow += figury[i].getpole();
                    System.out.format("Trojkat o polu %.3f i wysokosci %.3f\n", figury[i].pole, figury[i].wysokosc);
                    break;

                case 2:
                    figury[i] = new Kolo(losowanie.nextFloat());
                    nazwafigury.add("Kolo");
                    polefigury.add(figury[i].pole);
                    cechafigury.add(figury[i].srednica);
                    sumapolkol += figury[i].getpole();
                    System.out.format("Kolo o polu %.3f i srednicy %.3f\n", figury[i].pole, figury[i].srednica);
                    break;

            }
        }
    }
}




