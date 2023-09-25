package ModelElements;

import java.util.ArrayList;
import java.util.List;

public class PoligonalModel {
    public List<Poligon> Poligons = new ArrayList<>();
    public List<Texture> Textures = new ArrayList<>();

    public PoligonalModel(List<Texture> textures) {
        this.Textures = textures;
        Poligons = new ArrayList<>();
    }

    public PoligonalModel() {
    }
}
