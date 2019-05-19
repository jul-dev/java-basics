package collegeapp;

public class MyUtil {
    private static int studentId=101;

    public static int generateStudentId() {
        return ++studentId;
    }

    //String----->Array
    //string into date array [3] YYYY/MM/DD
    public static int[] convertStringToDateArray(String dob) {
        int arrDate[]=new int[3];
        arrDate [0]= Integer.parseInt(dob.substring(0,4));
        arrDate [1]= Integer.parseInt(dob.substring(5,7));
        arrDate [2]= Integer.parseInt(dob.substring(8,10));
        return arrDate;
    }
}
