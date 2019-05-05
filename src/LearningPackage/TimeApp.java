package LearningPackage;
import org.jetbrains.annotations.Contract;

import java.util.Scanner;

public class TimeApp {
    public static void main(String[] args) {
        //Get number of seconds from the user.
        System.out.println("Please enter the number of seconds");
        Scanner in=new Scanner(System.in);
        int seconds=in.nextInt();

        //convert seconds to hours,min,sec.
        //timeFromSeconds(seconds);
        int [] time = timeFromSeconds(seconds);
        System.out.printf(seconds+" seconds = %s hours, %s minutes, %s seconds", time[0],time[1],time[2]);


        //Show time to user



    }

//    static void timeFromSeconds(int seconds) {
//
//        int hours, mins, sec, rem;
//
//        hours= seconds/3600;
//        rem=seconds%3600;
//
//        mins=rem/60;
//        sec=rem%60;
//
//        System.out.printf(seconds+" seconds = %s hours, %s minutes, %s seconds", hours,mins,sec);
//
//
//    }
    //
    @Contract(value = "_ -> new", pure = true)
    static int[] timeFromSeconds(int seconds) {


        int hours, mins, sec, rem;

        hours= seconds/3600;
        rem=seconds%3600;

        mins=rem/60;
        sec=rem%60;
        return new int[] {hours,mins,sec};

    }

}

