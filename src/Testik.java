//import java.util.Scanner;

import java.io.IOException;
import java.util.Arrays;

public class Testik {

    public static void main(String[] args) {

        String[] contacts = new String[0];
        String[] words = new String[0];
        int nOfLetters=3; //regulates how many letters displayed in a word


        try {
            //read file into string array: each element is a line from the file
            contacts=Temp.readLines("c:\\temp\\contacts.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String s:contacts) {
            //display line
            System.out.println("\nLine: " +s);
            //put each word from a line into another string array
            words=s.split(",");

            System.out.println("Words:");
            //control number of letters by var nOfLetters
            for (String w:words) {
                if(w.length()>nOfLetters){
                    System.out.println(w.substring(0, nOfLetters));
                }else System.out.println(w.substring(0,w.length()-1));
            }
        }

    }
}