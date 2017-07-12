package gear;

/**
 * Created by tanerali on 12/07/2017.
 */
public class Tank {
    private int capacityCubicLitres, daysSinceLastMaintenance;

    private static int numAvailable;

    public Tank(int capacityCubicLitres, int daysSinceLastMaintenance) {
        this.capacityCubicLitres = capacityCubicLitres;
        this.daysSinceLastMaintenance = daysSinceLastMaintenance;
    }



//GETTERS AND SETTERS
    public int getCapacityCubicLitres() {
        return capacityCubicLitres;
    }

    public void setCapacityCubicLitres(int capacityCubicLitres) {
        this.capacityCubicLitres = capacityCubicLitres;
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
        Tank.numAvailable = numAvailable;
    }
}
