package gear;

/**
 * Created by tanerali on 12/07/2017.
 */
public class Regulator {
    private int daysSinceLastMaintenance;

    private static int numAvailable;


//GETTERS AND SETTERS
    public Regulator(int daysSinceLastMaintenance) {
        this.daysSinceLastMaintenance = daysSinceLastMaintenance;
    }

    public int getDaysSinceLastMaintenance() {
        return daysSinceLastMaintenance;
    }

    public void setDaysSinceLastMaintenance(int daysSinceLastMaintenance) {
        this.daysSinceLastMaintenance = daysSinceLastMaintenance;
    }

    public static int getNumAvailable() {
        return numAvailable;
    }

    public static void setNumAvailable(int numAvailable) {
        Regulator.numAvailable = numAvailable;
    }
}
