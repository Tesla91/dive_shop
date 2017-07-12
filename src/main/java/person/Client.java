package person;

/**
 * Created by nicola on 7/12/17.
 */
public class Client extends Person{
    private String lessonType;
    private double amountPaid;
    private String certificationLevel;

    public Client(String first_name, String last_name, int age, String lessonType,
                  String certificationLevel) {
        super(first_name, last_name, age);
        this.lessonType = lessonType;
        this.certificationLevel = certificationLevel;
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
