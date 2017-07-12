package person;

/**
 * Created by aaron on 7/12/17.
 */
public class Instructor extends Person {
    private static int numAvailable;
    private String certificationLevel;
    private int numTattoos;

    public Instructor(String first_name, String last_name, int age, String certificationLevel, int numTattoos) {
        super(first_name, last_name, age);
        this.certificationLevel = certificationLevel;
        this.numTattoos = numTattoos;
    }

    public static int getNumAvailable() {
        return numAvailable;
    }

    public static void setNumAvailable(int numAvailable) {
        Instructor.numAvailable = numAvailable;
    }

    public String getCertificationLevel() {
        return certificationLevel;
    }

    public void setCertificationLevel(String certificationLevel) {
        this.certificationLevel = certificationLevel;
    }

    public int getNumTattoos() {
        return numTattoos;
    }

    public void setNumTattoos(int numTattoos) {
        this.numTattoos = numTattoos;
    }
}
