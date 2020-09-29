package GeometryObjects.objects2D;

import GeometryObjects.Forme;

import java.util.Objects;

public class Rectangle extends Generique2D{

    private double d;
    private double D;

    public Rectangle(String nom, double d, double D) {
        super(nom);
        this.d = d;
        this.D = D;
    }

    @Override
    protected double calculSurface() {
        return d*D;
    }

    @Override
    protected double calculPerimetre() {
        return d*2+D*2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "d=" + d +
                ", D=" + D +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.d, d) == 0 &&
                Double.compare(rectangle.D, D) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(d, D);
    }
}
