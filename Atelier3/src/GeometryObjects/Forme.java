package GeometryObjects;

import java.util.Objects;

public abstract class Forme {
    private int counter;
    public final String id;

    public Forme(String nom){
        counter++;
        id = nom + "_" + counter;
    }

    protected abstract double calculSurface();
    public boolean isBiggerThan(Forme f){
        if (this.calculSurface()>f.calculSurface()){
            return true;
        }
        return false;
    }
}
