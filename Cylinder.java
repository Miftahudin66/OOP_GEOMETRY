package geometry;

public class Cylinder extends Geometry implements Calculable {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        super("Tabung");
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double getVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public double getSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Jari-jari: " + radius);
        System.out.println("Tinggi: " + height);
        System.out.println("Volume: " + getVolume());
        System.out.println("Luas Permukaan: " + getSurfaceArea());
    }
}
