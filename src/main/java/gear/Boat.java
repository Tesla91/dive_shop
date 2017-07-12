package gear;

/**
 * Created by daniel on 12.07.17.
 */
public class Boat {
    private static int numAvailable;
    private int capacity;

    Boat(int numAvailable, int capacity){
        this.numAvailable=numAvailable;
        this.capacity=capacity;
    }

    public static int getNumAvailable() {
        return numAvailable;
    }

    public static void setNumAvailable(int numAvailable) {
        Boat.numAvailable = numAvailable;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
