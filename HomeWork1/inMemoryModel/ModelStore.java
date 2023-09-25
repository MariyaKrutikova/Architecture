package inMemoryModel;

import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PoligonalModel;
import ModelElements.Scene;

import java.util.ArrayList;
import java.util.Formattable;
import java.util.List;

public class ModelStore {
    public List<PoligonalModel> Models;
    public List<Scene> Scenes;
    public List<Flash> Flashes;
    public List<Camera> Cameras;
    private List<IModelChangedObserver> changedObservers;

    public ModelStore(List<IModelChangedObserver> changedObservers) {
        this.changedObservers = changedObservers;
        this.Scenes = new ArrayList<>();
        this.Models = new ArrayList<>();
        this.Cameras = new ArrayList<>();
        this.Flashes =new ArrayList<>();

        Models.add(new PoligonalModel());
        Scenes.add(new Scene());
        Cameras.add(new Camera());
        Flashes.add(new Flash());

    }

    public Scene GetScena(int id){
        for (int i = 0; i < Scenes.size(); i++) {
            if (Scenes.get(i).id == id) {
                return Scenes.get(i);
            }
        }
        return null;
    }

    public void NotifyChange(IModelChanger ch) {
    }

}
