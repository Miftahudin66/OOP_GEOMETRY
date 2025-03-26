import geometry.*;

public class Main {
    public static void main(String[] args) {
        // Kubus
        Cube cube = new Cube(5);
        cube.displayInfo();
        System.out.println("Rumus Volume Kubus: Sisi³ = " + cube.getVolume());
        System.out.println("Rumus Luas Permukaan Kubus: 6 × Sisi² = " + cube.getSurfaceArea());

        System.out.println("\n====================================\n");

        // Tabung
        Cylinder cylinder = new Cylinder(3, 7);
        cylinder.displayInfo();
        System.out.println("Rumus Volume Tabung: π × r² × t = " + cylinder.getVolume());
        System.out.println("Rumus Luas Permukaan Tabung: 2 × π × r × (r + t) = " + cylinder.getSurfaceArea());

        System.out.println("\n====================================\n");

        // Balok
        RectangularPrism prism = new RectangularPrism(4, 3, 6);
        prism.displayInfo();
        System.out.println("Rumus Volume Balok: Panjang × Lebar × Tinggi = " + prism.getVolume());
        System.out.println("Rumus Luas Permukaan Balok: 2 × (P × L + P × T + L × T) = " + prism.getSurfaceArea());
    }
}
