package com.company;

public class Main {

    public static void main(String[] args) {
        //Osoba osoba = new Osoba("Jaś",7); nie można tworzyć obiektu klasy abstrakcyjnej
        Osoba uczen = new Uczen("Edek",8);

        Uczen uczen1 = new Uczen("Ala",7);
        System.out.println(uczen);
        System.out.println(uczen1);
        Wychowawca wychowawca1P = new Wychowawca("Zygmund","wf");
        System.out.println(wychowawca1P);
    }
}
