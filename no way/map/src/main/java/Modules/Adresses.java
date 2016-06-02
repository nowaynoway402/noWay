package Modules;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kamil Glonek on 31.05.16.
 */
public class Adresses {

    private ArrayList<Building> buildings = new ArrayList<Building>();

    public Adresses() {
        buildings.add(new Building("IFE", 51.755141, 19.451539));
        buildings.add(new Building("FTIMS", 51.747296, 19.453824));
        buildings.add(new Building("WEEIA", 51.752525, 19.453116));
        buildings.add(new Building("Mechaniczny" ,51.752867, 19.452510));
    }

    public ArrayList<Building> getBuildings() {
        return buildings;
    }

    public void setBuildings(ArrayList<Building> buildings) {
        this.buildings = buildings;
    }

    public Building getBuildingAt(int index) {
        return buildings.get(index - 1);
    }
}
