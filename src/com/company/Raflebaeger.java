package com.company;

import java.util.ArrayList;

public class Raflebaeger {

    private ArrayList<Terning> raflebaeger;

    public Raflebaeger() {
        raflebaeger=new ArrayList<Terning>();
    }

    public void tilfoej(Terning t){
        raflebaeger.add(t);
    }

    public void ryst(){
        for(Terning t: raflebaeger)
            t.kast();

    }

    public void udskrivindhold(){
        for(Terning t: raflebaeger)
            System.out.print(t.toString());
        System.out.print("Summer er: ");
        System.out.print(sum());
    }

    private int sum(){
        int s=0;
        for(Terning t: raflebaeger)
            s+=t.getVaerdi();
        return s;
    }
    public ArrayList<Terning> getArray(){
        return raflebaeger;
    }
}
