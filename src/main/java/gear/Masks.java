package gear;

/**
 * Created by aaron on 7/12/17.
 */
public class Masks {
    private static int numAvailable;
    private String color;
    private boolean isClean;

    public Masks(int numAvailable, String color, boolean isClean) {
        this.numAvailable = numAvailable;
        this.color = color;
        this.isClean = isClean;
    }

    public static int getNumAvailable() {
        return numAvailable;
    }

    public static void setNumAvailable(int numAvailable) {
        Masks.numAvailable = numAvailable;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isClean() {
        return isClean;
    }

    public void setClean(boolean clean) {
        isClean = clean;
    }
}
