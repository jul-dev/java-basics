package collegeapp;

import java.time.LocalDate;

public class Person {

    public Person(String gender, String fname, String lname) {
        this.fname=fname;
        this.lname=lname;
        this.gender=gender;
    }

    public Person(){

    }

    private String  gender;
    private String  fname;
    private String  lname;
    private String  ssn;
    private String  weight;
    private String  height;
    private LocalDate dob;

    @Override
    public String toString() {
        return "Person{" +
                "gender='" + gender + '\'' +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", ssn='" + ssn + '\'' +
                ", weight='" + weight + '\'' +
                ", height='" + height + '\'' +
                ", dob=" + dob +
                '}';
    }

    public LocalDate getDOB() {
        return dob;
    }

    public void setDOB(int year, int month, int day) {
        this.dob = LocalDate.of(year,month,day);
    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getSSN() {
        return ssn;
    }

    public void setSSN(String ssn) {
        this.ssn = ssn;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }


}
