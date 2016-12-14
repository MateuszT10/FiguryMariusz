package com.example;

import java.util.Random;

public class Main {

    Integer N = 10;
    Figura[] figury = new Figura[N];
    double sumapolkwadratow=0;
    double sumapolkol=0;
    double sumapoltrojkatow=0;

    public String[] nazwafigury = new String[N];
    public Float[] polefigury = new Float[N];
    public Float[] cechafigury = new Float[N];

    public static void main(String[] args) {
        Main obiekt = new Main();
        obiekt.losowanie();
    }


    void losowanie(){
        Random losowanie = new Random();
        Integer[] wybor = new Integer[N];

        for(int i=0; i<N; i++){
            wybor[i]= (losowanie.nextInt(3));
            //losowanie figur, 0-kwadrat, 1-trojkat, 2-kolo
        }

        for(int i=0; i<N; i++){
            switch(wybor[i]){
                case 0:
                    figury[i] = new Kwadrat(losowanie.nextDouble());
                    nazwafigury[i] = "Kwadrat";
                    polefigury[i] = String.format("%.3f",figury[i].pole);
                    cechafigury[i] = String.format("%.3f",figury[i].przekatna);
                    sumapolkwadratow += figury[i].getpole();
                    System.out.format("Kwadrat o polu %0.3f i przekatnej %0.3f", figury[i].pole, figury[i].przekatna);
                    break;

                case 1:
                    figury[i] = new Trojkat(losowanie.nextDouble());
                    nazwafigury[i] = "Trojkat";
                    polefigury[i] = String.format("%.3f",figury[i].pole);
                    cechafigury[i] = String.format("%.3f",figury[i].wysokosc);
                    sumapoltrojkatow += figury[i].getpole();
                    System.out.format("Trojkat o polu %0.3f i wysokosci %0.3f", figury[i].pole, figury[i].wysokosc);
                    break;

                case 2:
                    figury[i] = new Kolo(losowanie.nextDouble());
                    nazwafigury[i] = "Kolo";
                    polefigury[i] = String.format("%.3f",figury[i].pole);
                    cechafigury[i] = String.format("%.3f",figury[i].srednica);
                    sumapolkol += figury[i].getpole();
                    System.out.format("Kolo o polu %0.3f i srednicy %0.3f", figury[i].pole, figury[i].srednica);
                    break;

            }
        }
    }
}




