package ISP;

public class Sphere implements iShape3D{

    public Sphere(double radius) {
        this.radius = radius;
    }

    private double radius;

    @Override
    public double calcVolume() {
        return (4/3) * Math.PI * Math.pow(radius, 3);
    }
        
}
