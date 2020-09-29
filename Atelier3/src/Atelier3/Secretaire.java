package Atelier3;

import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 * Classe secretaire qui herite d'employe, une secretaire est un employe avec un ou plusieurs managers
 * (mais pas plus de 5) qui beneficie d'avantages salariaux en fonction du nombre de manager dont elle s'occupe
 */
public class Secretaire extends Employe {
    private int nbManager = 0;
    private ArrayList<Manager> managers = new ArrayList<Manager>();

    public Secretaire(String leNom, String lePrenom, GregorianCalendar laDate, Adresse lAdresse, Double salaire, GregorianCalendar dateEmbauche) {
        super(leNom, lePrenom, laDate, lAdresse, salaire, dateEmbauche);
    }

    /**
     * Permet l'ajout d'un manager a la liste de ceux dont la secretaire s'occupe, on verifie d'abord qu'il n'y en a pas deja 5
     * @param manager un manager
     */
    public void addManager(Manager manager){
        if (managers.size()<5){
            managers.add(manager);
            nbManager++;
        }
        else{
            System.out.println("Nombre de managers max deja atteint");
        }
    }

    /**
     * Permet le retrait d'un manager a la liste de ceux dont la secretaire s'occupe, on verifie d'abord qu'il soit bien present dans cette liste
     * @param manager un manager
     */
    public void removeManager(Manager manager){
        if (managers.contains(manager)){
            managers.remove(manager);
            nbManager--;
        }
    }

    /**
     * getter du nombre de manager pour qui la secretaire travaille
     * @return
     */
    public int getNbManager(){
        return nbManager;
    }

    /**
     * Augmente le salaire de la meme maniere que la methode homonyme de la classe Employe mais en appelant celle-ci apres avoir ajoute
     * et donc pris en compte les avanatages du statut de secretaire
     * @param pourcentage un poucentage d'augmentation auquel on ajoutera l'avantage du au nombre de manager pour lesquels la secretaire travaille
     */
    public void augmenterSalaire(double pourcentage){
        super.augmenterSalaire(pourcentage+0.1*nbManager);
    }
}

