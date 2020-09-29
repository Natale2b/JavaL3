package Atelier3;

import java.lang.annotation.ElementType;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test {
    public static void main(String[] args) {
        ArrayList<Employe> liste = new ArrayList<Employe>();
        Adresse adresseBasique = new Adresse(1,"ub","20200","yu");
        GregorianCalendar dateDeNaissanceGenerique = new GregorianCalendar();
        dateDeNaissanceGenerique.roll(Calendar.YEAR,-20);
        Employe e1 = new Employe("leNom1","A",dateDeNaissanceGenerique,adresseBasique,10000., new GregorianCalendar());
        Secretaire s1 = new Secretaire("leNom1","A",dateDeNaissanceGenerique,adresseBasique,10000., new GregorianCalendar());
        Manager m1 = new Manager("leNom1","A",dateDeNaissanceGenerique,adresseBasique,10000.,s1, dateDeNaissanceGenerique);
        s1.augmenterSalaire(100);
        System.out.println(s1.getSalaire());
    }
}