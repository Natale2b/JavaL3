package Atelier3;

import java.util.GregorianCalendar;

public class Manager extends Employe {
    private Secretaire secretaire;
    private int anciennete;

    /**
     * Classe manager qui herite d'employe, un manager est un employe avec une secretaire qui beneficie d'avantages salariaux en fonction de son anciennnete
     * On lui attribue une secretaire a la creation de poste, si la secretaire se charge deja de 5 managers le poste n'est pas cree
     */
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

    /**
     * Augmente le salaire de la meme maniere que la methode homonyme de la classe Employe mais en appelant celle-ci apres avoir ajoute
     * et donc pris en compte les avanatages du statut de manager
     * @param pourcentage un poucentage d'augmentation auquel on ajoutera l'avantage du a l'anciennete
     */
    public void augmenterSalaire(float pourcentage){
        super.augmenterSalaire(pourcentage+ 0.5*anciennete);
    }
}
