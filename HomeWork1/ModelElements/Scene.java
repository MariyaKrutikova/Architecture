package ModelElements;

import java.lang.reflect.Type;
import java.util.List;

public class Scene {
    public int id;
    public List<PoligonalModel> Models;
    public List<Flash> Flashes;

    public List<Camera> Cameras;

    public Scene() {
    }


    public <T> T method1(T one){
        return one;
    }
    public <T,E> T method2(T two, E one){
        return two;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Scene(int id, List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras) throws Exception {
        this.id = id;
        Flashes = flashes;

        if (models.size() > 0){
            Models = models;
        }
        else throw new Exception("Должная быть хотя бы одна модель!");

        if (cameras.size() >0 ) {
            Cameras = cameras;
        }
        else throw new Exception("Должная быть хотя бы одна камера!");
    }
}
