package Atelier3;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Secretaire extends Employe {
    private int nbManager = 0;
    private ArrayList<Manager> managers;

    public Secretaire(String leNom, String lePrenom, GregorianCalendar laDate, Adresse lAdresse, Double salaire, GregorianCalendar dateEmbauche) {
        super(leNom, lePrenom, laDate, lAdresse, salaire, dateEmbauche);
    }

    public void addManager(Manager manager){
        if (managers.size()<5){
            managers.add(manager);
            nbManager++;
        }
        else{
            System.out.println("Nombre de managers max deja atteint");
        }
    }

    public void removeManager(Manager manager){
        if (managers.contains(manager)){
            managers.remove(manager);
            nbManager--;
        }
    }

    public int getNbManager(){
        return nbManager;
    }

    public void augmenterSalaire(double pourcentage){
        super.augmenterSalaire(pourcentage+0.1*nbManager);
    }
}

