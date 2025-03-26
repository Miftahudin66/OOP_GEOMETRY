package geometry;

public class Cube extends Geometry implements Calculable {
    private double side;

    public Cube(double side) {
        super("Kubus");
        this.side = side;
    }

    @Override
    public double getVolume() {
        return Math.pow(side, 3);
    }

    @Override
    public double getSurfaceArea() {
        return 6 * Math.pow(side, 2);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Sisi: " + side);
        System.out.println("Volume: " + getVolume());
        System.out.println("Luas Permukaan: " + getSurfaceArea());
    }
}
