package LearningPackage;

import java.util.Scanner;

public class MaxMain {

    public static int max(int x,int y){
        if (x > y) {
            return x;
        } else return y;
    }

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number");
        int x=reader.nextInt();

        System.out.println("Enter a number");
        int y=reader.nextInt();
        reader.close();

        System.out.println("this is the greater number of the two: "+ max(x,y));
    }
}