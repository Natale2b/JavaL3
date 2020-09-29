package GeometryObjects.objects2D;

import GeometryObjects.Forme;

public class Ellipse extends Generique2D {
    private double a;
    private double b;

    public Ellipse(String nom,double petitAxe,double grandAxe) {
        super(nom);
        this.a = petitAxe;
        this.b = grandAxe;
    }

    @Override
    protected double calculSurface() {
        return Math.PI*a*b;
    }

    @Override
    protected double calculPerimetre() {
        return Math.PI*2*Math.sqrt((Math.pow(a,2)+Math.pow(b,2))/2);
    }

    @Override
    public String toString() {
        return "Ellipse{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
