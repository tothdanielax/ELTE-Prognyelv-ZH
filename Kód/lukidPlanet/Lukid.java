package lukidPlanet;

import lukidPlanet.errors.*;
import lukidPlanet.*;
import java.util.ArrayList;

class Lukid extends NamedEntity {

    static final String os1 = "Luko";
    static final String os2 = "Luka";

    // utolsó előtti feladat
    public static int id = 0;
    private int curr_id = 0;
    //

    

    private Lukid(String lukid) throws OccupiedNameException{
        super(lukid);
        System.out.println(lukid + " has been born.");
    }

    public void createLukid(String n) {
        try {
            Lukid l = new Lukid(n);
        } catch (lukidPlanet.errors.OccupiedNameException ex) {
            System.out.println("This name is occupied: " + n);
        }
    }

    public void die(String n) {
        try {
            Lukid l = new Lukid(n);

            if(n == os1 || n == os2) {
                throw new IllegalArgumentException();
            }
        } catch(lukidPlanet.errors.OccupiedNameException ex) {
            Set.remove(n);
            System.out.println(super.getName() + " has died.");
        } catch(IllegalArgumentException ex) {
            System.out.println("Luko and Luka are immortal.");
        };
    }

    public boolean equals() {}

    @Override
    public String getName() {
        return "Lukid " + super.getName();
    } 
}