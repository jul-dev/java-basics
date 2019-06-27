package LearningPackage.ThinkJava;

public class Date {

    static String day="Thursday";
    static int date=27;
    static String month="July";
    static int year =2019;



   static String message = "Hello ,";
   static String messTwo= "World !";

    public static void main(String[] args) {
        System.out.println(message + messTwo);

        System.out.println(day +", "+ month + " " +date+", "+year);
        System.out.println(day + " "+ date + " "+ month + " "+ year);
    }
}
