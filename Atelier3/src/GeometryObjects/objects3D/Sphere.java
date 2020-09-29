package GeometryObjects.objects3D;

public class Sphere extends Generique3D{
    private double rayon;

    public Sphere(String nom,double r) {
        super(nom);
        rayon = r;
    }

    @Override
    public double calculSurface() {
        return 4 * Math.PI * Math.pow(rayon,2);
    }

    @Override
    public double calculVolume() {
        return 4/3 * Math.PI * Math.pow(rayon,3);
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "rayon=" + rayon +
                '}';
    }
}


