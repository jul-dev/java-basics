package collegeapp;

import java.awt.*;
import java.util.Scanner;

public class AllStudents {
    private Student arrStudents []=new Student[10];
    Scanner sc=new Scanner(System.in);

    public Student[] getAllStudents() {
        return arrStudents;
    }

    public void addNewStudent() {
        System.out.println("New Student registration menu");
        System.out.println();

        Student student=new Student();

        System.out.println("Please enter your first name");
        sc.nextLine();
        student.setFname(sc.nextLine());
        System.out.println("Please enter your last name");
        student.setLname(sc.nextLine());
        System.out.println("What is your gender");
        student.setGender(sc.nextLine());
        System.out.println("Please enter your SS#");
        student.setSSN(sc.nextLine());
        System.out.println("Please enter your DOB 'YYYY/MM/DD'");
        String dob=sc.nextLine();
        System.out.println(dob);
        int[] date=MyUtil.convertStringToDateArray(dob); //array contains year index 0, month index 1, date index 2
        student.setDOB(date[0],date[1],date[2]);
        System.out.println("Please enter your weight");
        student.setWeight(sc.nextLine());
        System.out.println("Please enter your height");
        student.setHeight(sc.nextLine());
        student.setId(MyUtil.generateStudentId());
        System.out.println("Your student id is : " +student.getId()+" Please take a note of it.");
        StudentAppDemo.allStudents.setStudent(student);
//        StudentAppDemo.allStudents.printAllStudents();
    }

    public void setStudent(Student student) {
        int i= findInsertPoint();
        if (i!=-1)
            arrStudents[i] = student;
    }
    public void printAllStudents(){
        for (Student s :arrStudents) {
           if (s!=null)System.out.println(s.toString());
        }
    }
        //finds students by id.
        // Goes through array and returns 1st student that matches student id.
    public Student findStudent(int id){
        for (Student s:arrStudents)
              {
            if (s.getId()==id)
                return s;
        }

        return null;
    }

    public Student getStudent(int id){
        //return student with student id=id
        //!!!fix return to search for id not index
        return arrStudents[id];
    }

    private int findInsertPoint() {
        //find first null element in the array and return its index
        for (int i=0; i<arrStudents.length;i++){
            if (arrStudents[i] == null)
                return i;
        }
        //add 10 elements to array
        Student temArr[]=new Student[arrStudents.length+10];
        System.arraycopy(arrStudents,0,temArr,0,arrStudents.length);
        //insertion point with the length of old array
        int insPoint =arrStudents.length;
        arrStudents=temArr;
        return insPoint;
    }



}
