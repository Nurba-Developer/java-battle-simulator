package Unit;

import java.util.ArrayList;

public interface GameInterfase {
    StringBuilder getInfo();

    void step(ArrayList<Hero> team1, ArrayList<Hero> team2);

}
