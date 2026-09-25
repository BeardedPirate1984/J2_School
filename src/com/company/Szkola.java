package com.company;

import java.util.ArrayList;

public class Szkola {
    private String nazwaSzkoly;
    private ArrayList<Uczen> uczniowie; // do przemyslenia czy potrzebne
    private ArrayList<Klasa> klasy;
    private ArrayList<Nauczyciel> nauczyciele;
    private static Szkola szkola;


    private Szkola(String nazwaSzkoly) {
        this.nazwaSzkoly = nazwaSzkoly;
    }

    public static Szkola getSzkola(String nowaNazwa) {
        if (szkola == null){
            szkola = new Szkola(nowaNazwa);
        }
        return szkola;
    }

    public void dodajKlase(Klasa klasa){
        klasy.add(klasa);
        System.out.println("Dodano klasę");
    }

    public void dodajNauczyciel(Nauczyciel nauczyciel){
        nauczyciele.add(nauczyciel);
    }


    public void przepiszUcznieZKlasyDoKlasy(Uczen uczen, Klasa klasaDocelowa){
        for (Klasa x : klasy){
            if (x.getUczniowie().contains(uczen)){
                x.usunUczniaZKlasy(uczen);
                klasaDocelowa.dodajUczniaDoKlasy(uczen);
                break;
            }
        }
    }

    public void dodajNowegoUczniaDoSzkoly(String imie, int wiek, Klasa klasa){
        Uczen uczen = new Uczen(imie, wiek);
        klasa.dodajUczniaDoKlasy(uczen);
        uczniowie.add(uczen);
    }

    public void dodajUczniaBezKlasy(Uczen uczen){
        uczniowie.add(uczen);
    }
    @Override
    public String toString() {
        return "Szkola{" +
                "nazwaSzkoly='" + nazwaSzkoly + '\'' +
                '}';
    }
}
