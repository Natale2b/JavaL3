package GeometryObjects.objects2D;

import GeometryObjects.Forme;

public abstract class Generique2D extends Forme {
    public Generique2D(String nom) {
        super(nom);
    }

    @Override
    protected abstract double calculSurface();

    protected abstract double calculPerimetre();
}
