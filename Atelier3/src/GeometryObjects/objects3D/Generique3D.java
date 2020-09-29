package GeometryObjects.objects3D;

import GeometryObjects.Forme;

public abstract class Generique3D extends Forme {


    public Generique3D(String nom) {
        super(nom);
    }
    public abstract double calculVolume();

}
