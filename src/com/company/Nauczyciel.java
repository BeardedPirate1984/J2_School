package com.company;

public class Nauczyciel extends Osoba implements Dyzurny{
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

    @Override
    public void wykonaDyzur() {
        System.out.println("Spacer po korytarzu");
    }
}
