package person;

/**
 * Created by nicola on 7/12/17.
 */
public class Client extends Person{
    private int clientID;
    private String lessonType;
    private double amountPaid;
    private String certificationLevel;

    public Client(String first_name, String last_name, String age, int clientID, String lessonType,
                  double amountPaid, String certificationLevel) {
        super(first_name, last_name, age);
        this.clientID = clientID;
        this.lessonType = lessonType;
        this.amountPaid = amountPaid;
        this.certificationLevel = certificationLevel;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public String getLessonType() {
        return lessonType;
    }

    public void setLessonType(String lessonType) {
        this.lessonType = lessonType;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public String getCertificationLevel() {
        return certificationLevel;
    }

    public void setCertificationLevel(String certificationLevel) {
        this.certificationLevel = certificationLevel;
    }
}
