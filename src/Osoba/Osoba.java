package Osoba;


public class Osoba {

    
    private int[] tab;
    private int ile;
    private String imie;
    private String nazwisko;
    
    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    
    public String getimie(){
        return imie;
    }
    
    public String getnazwisko(){
        return nazwisko;
    }
    
}
