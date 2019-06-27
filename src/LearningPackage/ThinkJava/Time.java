package LearningPackage.ThinkJava;

public class Time {
    public static void main(String[] args) {

        int hour, minutes, seconds;
        hour = 16;
        minutes = 37;
        seconds = 32;

       int totalSecSinceMindnight= hour*60*60+seconds;
        System.out.println(totalSecSinceMindnight);

    }
}