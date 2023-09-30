package ISP;

public class Square implements iShape {

    public Square(double length, double height) {
        this.length = length;
        this.height = height;
    }

    private double length;
    private double height;

    @Override
    public double calcArea() {
        return length*height;
        
    }
    
}
