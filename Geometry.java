package geometry;

public abstract class Geometry {
    protected String name;

    public Geometry(String name) {
        this.name = name;
    }

    public abstract double getVolume();
    public abstract double getSurfaceArea();

    public void displayInfo() {
        System.out.println("Bangun Ruang: " + name);
    }
}
