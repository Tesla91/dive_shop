package gear;

/**
 * Created by nicola on 7/12/17.
 */
public class Wetsuit {
    private static int namAvailable;
    private String size;
    private String color;
    private boolean isClean;

    public Wetsuit(String size, String color, boolean isClean) {
        this.size = size;
        this.color = color;
        this.isClean = isClean;
    }

    public static int getNamAvailable() {
        return namAvailable;
    }

    public static void setNamAvailable(int namAvailable) {
        Wetsuit.namAvailable = namAvailable;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
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
