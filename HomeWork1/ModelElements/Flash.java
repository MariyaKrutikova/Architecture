package ModelElements;

import Staff.Angle3D;
import Staff.Point3D;

import java.awt.*;

public class Flash {
    public Point3D Location;
    public Angle3D Angle;
    public Color Color;
    public Float Power;

    public Flash() {
    }

    public Flash(Point3D location, Angle3D angle, java.awt.Color color, Float power) {
        Location = location;
        Angle = angle;
        Color = color;
        Power = power;
    }

    public void Rotate (Angle3D angel) {
    }

    public void Move (Point3D point){
    }
}
