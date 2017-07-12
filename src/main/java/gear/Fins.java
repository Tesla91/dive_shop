package gear;

/**
 * Created by daniel on 12.07.17.
 */
public class Fins {
    private static int numAvailable;
    private int size;

    public Fins (int size){
        this.size=size;
    }

    public static int getNumAvailable() {
        return numAvailable;
    }

    public static void setNumAvailable(int numAvailable) {
        Fins.numAvailable = numAvailable;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
