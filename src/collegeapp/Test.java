package collegeapp;

public class Test {

    public static void main(String[] args) {
        AllStudents allStudents=new AllStudents();

        for (int i = 0; i < 100; i++) {
            System.out.println(MyUtil.generateStudentId());


        }
    }
}