package com.company;

public class Nauczyciel extends Osoba{
    private String przedmiot;

    public Nauczyciel(String imie,String przedmiocik) {
        super(imie);
        przedmiot = przedmiocik;
    }

    @Override
    public String toString() {
        return "Nauczyciel{" +
                "przedmiot='" + przedmiot + '\'' +
                ", imie='" + imie + '\'' +
                '}';
    }
}
