package ModelElements;

import Staff.Angle3D;
import Staff.Point3D;

public class Camera {
    public Point3D Location;
    public Angle3D Angle;


    public Camera(Point3D location, Angle3D angle) {
        Location = location;
        Angle = angle;
    }

    public Camera() {
        ;
    }

    public void Rotate (Angle3D angel3D) {
    }

    public void Move (Point3D point3D){
    }
}
