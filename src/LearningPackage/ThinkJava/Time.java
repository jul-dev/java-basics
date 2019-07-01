package ThinkJava;

public class Time {
    public static void main(String[] args) {

        double hour, minutes, seconds;
        hour = 16;
        minutes = 37;
        seconds = 32;

       double totalSecSinceMindnight= hour*60*60+seconds;
        System.out.println(totalSecSinceMindnight);

        int totalSecInDay= 24*60*60;

        double totalSecRemInDay= totalSecInDay-totalSecSinceMindnight;
        System.out.println(totalSecRemInDay);

        double total= totalSecRemInDay+totalSecSinceMindnight;
        System.out.println(total);

        double percentLeft= (16*100)/24;
        System.out.println(percentLeft);
    }
}