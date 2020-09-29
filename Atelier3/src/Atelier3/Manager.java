package Atelier3;

import java.util.GregorianCalendar;

public class Manager extends Employe {
    private Secretaire secretaire;
    private int anciennete;


    public Manager(String leNom, String lePrenom, GregorianCalendar laDate, Adresse lAdresse, Double salaire, Secretaire secretaire, GregorianCalendar dateEmbauche) {
        super(leNom, lePrenom, laDate, lAdresse, salaire,dateEmbauche);
        try{
            if (secretaire.getNbManager()>=5){
                throw new Exception("La secretaire a deja trop de managers");
            }
            else{
                secretaire.addManager(this);
                this.secretaire = secretaire;
            }
            anciennete = super.calculAnnuite();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public void augmenterSalaire(float pourcentage){
        super.augmenterSalaire(pourcentage+ 0.5*anciennete);
    }
}
