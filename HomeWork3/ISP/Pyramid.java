package ISP;

public class Pyramid implements iShape3D {
    
    private double height;
    private double baseArea;


    @Override
    public double calcVolume() {
        return (1/3) * baseArea * height;
    }


    public Pyramid(double height, double baseArea) {
        this.height = height;
        this.baseArea = baseArea;
    }

}