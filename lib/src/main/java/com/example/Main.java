package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    List<Figura> figury = new ArrayList<>();
    float sumapolkwadratow=0;
    float sumapolkol=0;
    float sumapoltrojkatow=0;

    public List<String>  nazwafigury = new ArrayList<String>();
    public List<String>   polefigury = new ArrayList<String>();
    public List<String>  cechafigury = new ArrayList<String>();

    public static void main(String[] args) {
        Main obiekt = new Main();
        obiekt.losowanie(10);
    }


    public void losowanie(int N){
        Random losowanie = new Random();
        List<Integer> wybor = new ArrayList<Integer>();
        for(int i = 0; i < N; i++) {
            wybor.add(losowanie.nextInt(3)); //wylosowanie rodzaju figury
            //losowanie figur, 0-kwadrat, 1-trojkat, 2-kolo
        }

        for(int i=0; i<N; i++){
            switch(wybor.get(i)){
                case 0:
                    figury.add(new Kwadrat(losowanie.nextFloat()));
                    nazwafigury.add("Kwadrat");
                    polefigury.add(String.format("%.3f",figury.get(i).pole));
                    cechafigury.add(String.format("%.3f",figury.get(i).przekatna));
                    sumapolkwadratow += figury.get(i).getpole();
                    System.out.format("Kwadrat o polu %.3f i przekatnej %.3f\n", figury.get(i).pole, figury.get(i).przekatna);
                    break;

                case 1:
                    figury.add(new Trojkat(losowanie.nextFloat()));
                    nazwafigury.add("Trojkat");
                    polefigury.add(String.format("%.3f",figury.get(i).pole));
                    cechafigury.add(String.format("%.3f",figury.get(i).wysokosc));
                    sumapoltrojkatow += figury.get(i).getpole();
                    System.out.format("Trojkat o polu %.3f i wysokosci %.3f\n", figury.get(i).pole, figury.get(i).wysokosc);
                    break;

                case 2:
                    figury.add(new Kolo(losowanie.nextFloat()));
                    nazwafigury.add("Kolo");
                    polefigury.add(String.format("%.3f",figury.get(i).pole));
                    cechafigury.add(String.format("%.3f",figury.get(i).srednica));
                    sumapolkol += figury.get(i).getpole();
                    System.out.format("Kolo o polu %.3f i srednicy %.3f\n", figury.get(i).pole, figury.get(i).srednica);
                    break;

            }
        }
    }
}




