package GeometryObjects.objects2D;

import GeometryObjects.Forme;

public class Cercle extends Generique2D {
    private double rayon;

    public Cercle(String nom,double rayon) {
        super(nom);
        this.rayon = rayon;
    }

    @Override
    protected double calculSurface() {
        return Math.PI * (Math.pow(rayon,2));
    }

    @Override
    protected double calculPerimetre() {
        return (rayon*2)*Math.PI;
    }

    @Override
    public String toString() {
        return "Cercle{" +
                "rayon=" + rayon +
                '}';
    }
}
