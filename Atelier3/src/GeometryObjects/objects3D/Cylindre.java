package GeometryObjects.objects3D;

public class Cylindre extends Generique3D {

    private double rayon;
    private double hauteur;

    public Cylindre(String nom, double r, double h) {
        super(nom);
        this.rayon = r;
        this.hauteur = h;
    }

    @Override
    public double calculVolume() {
        return Math.PI*Math.pow(rayon,2)*hauteur;
    }

    @Override
    protected double calculSurface() {
        return 2*Math.PI*rayon*hauteur+2*Math.PI*Math.pow(rayon,2);
    }

    @Override
    public String toString() {
        return "Cylindre{" +
                "rayon=" + rayon +
                ", hauteur=" + hauteur +
                '}';
    }
}
