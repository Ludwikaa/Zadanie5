package Kartoteki;

import Osoba.Osoba;
import java.util.ArrayList;
import java.util.List;

public class KartotekaReal {
    
    List<Osoba> lista;
    
    public KartotekaReal(){
        lista = new ArrayList<>();
    }
    
    public void Dodaj(Osoba os){
        lista.add( os);
    }
    
    public void Usun(Osoba os){
        lista.remove(os);
    }
    
    public int Rozmiar(){
        return lista.size();
    }
    
    public boolean CzyZawiera(Osoba os){
        return lista.contains(os);
    }
    
    public Osoba Pobierz(int index){
        if(index > Rozmiar())
            return null;
        return lista.get(index);
    }
    
}
