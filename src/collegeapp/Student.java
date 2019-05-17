package collegeapp;

public class Student extends Person {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private int id= 0;
    private double gpa=0;

    @Override
    public String toString(){
        return
                "Student{" + ", id=" + id +
                ", gender='" + super.getGender() + '\'' +
                ", fname='" + super.getFname() +
                ", lname='" + super.getLname() + '\'' +
                ", ssn='" + super.getSSN() + '\'' +
                ", weight='" + super.getWeight() + '\'' +
                ", height='" + super.getHeight() + '\'' +
                ", dob=" + super.getDOB() +
                ", gpa=" + gpa +
                '}';
    }
}
