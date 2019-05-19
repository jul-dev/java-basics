package collegeapp;

public class StudentAppDemo {
    static AllStudents allStudents;

    public static void main(String[] args) {
        Menu menu=new Menu();
        allStudents=new AllStudents();
        menu.run();
//        allStudents=new AllStudents();
//        run();
////        allStudents.printAllStudents();
////        printArray(allStudents.getAllStudents());
//        System.out.println();
//        testFindStudent(10);

    }

    private static void testFindStudent(int i) {
        System.out.println(allStudents.findStudent(i));
    }

    public static void run(){
        for (int i=0;i<15;i++){
             Student obj = new Student();
             obj.setGpa(3.7);
             obj.setId(i);
             obj.setDOB(81, 4, 12);
             obj.setFname("Julia");
             obj.setSSN("123-232-2323");
             obj.setGender("Female");
             obj.setHeight("5'9");
             obj.setLname("Alcantara");
             obj.setWeight("189");
//             System.out.println(obj);
            allStudents.setStudent(obj);

         }
    }
    static void printArray(Student[] o){
        for (Student s: o){
            System.out.println(s);
        }
    }
}


