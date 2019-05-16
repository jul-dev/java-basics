package LearningPackage;

public class Student extends Person {

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private String id= "";
    private double gpa=0;

    public Student(){
        super("O","house","garage");
    }

    @Override
    public String toString(){
        return "Student{" +
                "gender='" + super.getGender() + '\'' +
                ", fname='" + super.getFname() +
                ", lname='" + super.getLname() + '\'' +
                ", ssn='" + super.getSSN() + '\'' +
                ", weight='" + super.getWeight() + '\'' +
                ", height='" + super.getHeight() + '\'' +
                ", dob=" + super.getDOB() +
                ", gpa=" + gpa +
                ", id=" + id +
                '}';
    }
}
