package Atelier3;

import java.lang.annotation.ElementType;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test {
    public static void main(String[] args) {
        ArrayList<Employe> liste = new ArrayList<Employe>();
        Adresse adresseBasique = new Adresse(1,"ub","gu","yu");
        GregorianCalendar dateDeNaissanceGenerique = new GregorianCalendar();
        dateDeNaissanceGenerique.roll(Calendar.YEAR,-10);
        Employe e1 = new Employe("leNom1","A",dateDeNaissanceGenerique,adresseBasique,10000., new GregorianCalendar());

    }
}