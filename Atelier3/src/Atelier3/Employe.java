package Atelier3;

import org.jetbrains.annotations.NotNull;

import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Employe extends Personne{
    private double salaire;
    private GregorianCalendar dateEmbauche;


    public Employe(String leNom, String lePrenom, GregorianCalendar laDate, Adresse lAdresse, Double salaire,GregorianCalendar dateEmbauche) {
        super(leNom, lePrenom, laDate, lAdresse);
        GregorianCalendar dateDuJour = GregorianCalendar.from(ZonedDateTime.now());
        try{
            int date = dateDuJour.getWeekYear()-laDate.getWeekYear();
            System.out.println(date);
            if (date<16 || date>65){
                throw new Exception("L'age d'un employe doit etre compris entre 16 et 65 ans");
            }
            else{
                this.salaire = salaire;
                if (dateEmbauche == null){
                    this.dateEmbauche = GregorianCalendar.from(ZonedDateTime.now());
                }
                this.dateEmbauche = dateEmbauche;
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public void augmenterSalaire(double pourcentage){
        try{
            if (pourcentage<0){
                throw new Exception("Le poucentage doit etre positif");
            }
            else{
                this.salaire = this.salaire + (this.salaire*pourcentage)/100;
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public int calculAnnuite(){
        GregorianCalendar ajd = new GregorianCalendar();
        int an = ajd.getWeekYear() - dateEmbauche.getWeekYear();
        int jourDeLan = ajd.get(6) - dateEmbauche.get(6);
        return jourDeLan>0 ? an + 1 : an;
    }
}
