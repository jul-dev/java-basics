package collegeapp;

public class AllStudents {
    private Student arrStudents []=new Student[10];

    public Student[] getAllStudents() {
        return arrStudents;
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
