package lukidPlanet.errors;

import java.lang.Exception;
import java.lang.Throwable;

public class OccupiedNameException extends Exception {

    public OccupiedNameException() {
        super();
    }

    public OccupiedNameException(String lukid) {
        super();

        System.out.println("The following name is occupied: " + lukid);
    }
}