package Atelier3;

import org.jetbrains.annotations.NotNull;

import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Employe extends Personne{
    private double salaire;
    private GregorianCalendar dateEmbauche;

    /**
     * Classe Employe servant a modeliser un employe avec son salaire et sa date d'embauche, herite de Personne
     * @param leNom Le nom de l'employe
     * @param lePrenom Le prenom de l'employe
     * @param laDate La date de naissance de l'employe
     * @param lAdresse L'adresse de l'employe
     * @param salaire Le montant du salaire de l'employe
     * @param dateEmbauche La date d'embauche de l'employe, si elle n'est pas specifiee elle sera fixee a la date du jour
     */
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

    /**
     *Augmentation du salaire selon un pourcentage, on verifie que celui-ci soit bien positif.
     * @param pourcentage Un nombre positif
     */
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

    /**
     *Calcul de l'anciennete de l'employe, toute annee commencee est comptabilisee
     * @return retourne l'anciennete
     */
    public int calculAnnuite(){
        GregorianCalendar ajd = new GregorianCalendar();
        int an = ajd.getWeekYear() - dateEmbauche.getWeekYear();
        int jourDeLan = ajd.get(6) - dateEmbauche.get(6);
        return jourDeLan>0 ? an + 1 : an;
    }

    public double getSalaire(){
        return  salaire;
    }
}
