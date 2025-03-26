package geometry;

public class RectangularPrism extends Geometry implements Calculable {
    private double length, width, height;

    public RectangularPrism(double length, double width, double height) {
        super("Balok");
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double getVolume() {
        return length * width * height;
    }

    @Override
    public double getSurfaceArea() {
        return 2 * (length * width + length * height + width * height);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Panjang: " + length);
        System.out.println("Lebar: " + width);
        System.out.println("Tinggi: " + height);
        System.out.println("Volume: " + getVolume());
        System.out.println("Luas Permukaan: " + getSurfaceArea());
    }
}
