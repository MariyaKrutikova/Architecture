package ISP;

public class Circle implements iShape{

    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcArea() {       
        return Math.PI*Math.pow(radius, 2);
    }
    
}
