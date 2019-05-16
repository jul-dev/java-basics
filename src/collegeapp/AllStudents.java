package collegeapp;

public class AllStudents {
    Student arrStudents []=new Student[10];

    public Student[] getAllStudents() {
        return arrStudents;
    }

    public void setStudent(Student student) {
        int i=findIncertPoint();
        if (i!=-1)
            arrStudents[i] = student;
    }

    public Student getStudent(int id){
        //return student with student id=id
        //!!!fix return to search for id not index
        return arrStudents[id];
    }

    private int findIncertPoint() {
        //find first null element in the array and return its index
        for (int i=0; i<arrStudents.length;i++){
            if (arrStudents[i] == null)
                return i;
        }
        //add 10 elements to array
        Student temArr[]=new Student[arrStudents.length+10];
        System.arraycopy(arrStudents,0,temArr,0,arrStudents.length);
        arrStudents=temArr;
        return -1;
    }



}
