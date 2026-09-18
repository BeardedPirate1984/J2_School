package com.company;

public abstract class Osoba {
    //abstrakcyjna klasa nie pozwala na tworzenie obiektów tej klasy
    protected String imie;
    private int wiek;
    /*
    modyfikatory dostepu
    public dostępne wszędzie
    private dostępne tylko w tej klasie
    protected - dostęne w tej klasie i klasie z niej dziedziczącej
    w Javie dostęne w całym pakiecie
    bral modyfikatora dostępu - dostępny w pakiecie
     */

    public Osoba(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }

    public Osoba(String imie) {
        this.imie = imie;
    }

    public int getWiek() {
        return wiek;
    }
}
