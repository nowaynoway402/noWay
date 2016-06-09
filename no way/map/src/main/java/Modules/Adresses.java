package Modules;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kamil Glonek on 31.05.16.
 */
public class Adresses {

    private ArrayList<Building> buildings = new ArrayList<Building>();

    public Adresses() {
        buildings.add(new Building("New WIPOS", 51.755119, 19.452399));
        buildings.add(new Building("BINOZ", 51.754680, 19.452613));
        buildings.add(new Building("WEEIA", 51.753021, 19.453388));
        buildings.add(new Building("IFE", 51.755141, 19.451539));
        buildings.add(new Building("Factory of XXI Century Engineers", 51.754947, 19.451575));
        buildings.add(new Building("Soltan Auditorium", 51.753741, 19.451796));
        buildings.add(new Building("Faculty of Mechanical Engineering", 51.752843, 19.452623));
        buildings.add(new Building("Faculty of Chemistry", 51.753703, 19.451013));
        buildings.add(new Building("BON", 51.752251, 19.451321));
        buildings.add(new Building("WTMIWT", 51.752827, 19.450255));
        buildings.add(new Building("Rector's Office", 51.748655, 19.455128));
        buildings.add(new Building("BAIS", 51.747566, 19.451277));
        buildings.add(new Building("FTIMS", 51.747199, 19.453753));
        buildings.add(new Building("WIPOS", 51.747422, 19.455436));
        buildings.add(new Building("Institute of Physics", 51.746433, 19.455790));
        buildings.add(new Building("IPIP", 51.746081, 19.454541));
        buildings.add(new Building("BMCS", 51.745924, 19.455555));
        buildings.add(new Building("CTI", 51.747190, 19.455870));
        buildings.add(new Building("Library", 51.745643, 19.454954));
        buildings.add(new Building("Language Centre", 51.744923, 19.451325));
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
