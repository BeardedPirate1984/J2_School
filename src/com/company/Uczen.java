package com.company;

public class Uczen extends Osoba implements Dyzurny{
    private static int liczbaUCzniow = 0;
    private int nrUcznia;

    public Uczen(String imie, int wiek) {
        super(imie, wiek);
        liczbaUCzniow++;
        nrUcznia=liczbaUCzniow;
    }

    @Override
    public String toString() {
        return "Uczen{" +
                " imie='" + imie + '\'' +
                " wiek = "+getWiek()+
                ", nrUcznia=" + nrUcznia +
                '}';
    }

    @Override
    public void wykonaDyzur() {
        System.out.println("Podlej kwiatki");
    }
}
