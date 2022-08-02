package lukidPlanet;

import java.util.ArrayList;
import java.lang.Exception;
import lukidPlanet.errors.*;

abstract class NamedEntity {
    protected static ArrayList<String> Set = new ArrayList<String>();

    private String name;

    protected NamedEntity(String name) throws OccupiedNameException {
            for(String s : Set) {
                if(name == s) {
                    throw new lukidPlanet.errors.OccupiedNameException(name);
                }
            }

            Set.add(name); 
            this.name = name; 
    }

    public String getName() {return name;} 
}