package ModelElements;

import Staff.Point3D;

import java.util.ArrayList;
import java.util.List;

public class Poligon{
    public List<Point3D> points = new ArrayList();

    public Poligon(List<Point3D> points) throws Exception {
        if ( points.size() >0 ) {
            this.points = points;
        } else
            throw new Exception("Должна быть хотя бы одна точка!");
    }
}
