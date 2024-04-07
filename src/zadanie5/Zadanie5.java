package zadanie5;

import Kartoteki.KartotekaReal;
import Osoba.Osoba;
import java.util.Scanner;

public class Zadanie5 {

    public static void main(String[] args){
        KartotekaReal kart = new KartotekaReal();
        
        Osoba os1 = new Osoba("Jan", "Kowalski");
        Osoba os2 = new Osoba("Marek", "Przesada");
        
        kart.Dodaj(os1);
        kart.Usun(os1);
        System.out.println(kart.Rozmiar());
        kart.Dodaj(os1);
        System.out.println(kart.CzyZawiera(os1));
        System.out.println(kart.CzyZawiera(os2));
        kart.Dodaj(os2);
        System.out.println(kart.Rozmiar());
        Osoba pobrana = kart.Pobierz(0);
        System.out.println(pobrana.getimie() + " " + pobrana.getnazwisko());
        
        
        
    }
    
}
