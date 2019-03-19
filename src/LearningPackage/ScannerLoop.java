package LearningPackage;

import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerLoop {
    static void checkAge(int age){
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }

        System.out.println("Still alive!");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age;
        do {
            try {
                System.out.println("Enter your age:");
                age=sc.nextInt();
                checkAge(age);
                break;
            }
            catch (InputMismatchException e) {
                System.out.println(e.fillInStackTrace());
                System.out.println("enter your age as a whole number");
                sc.next();
            }
            catch (Exception e) {
                System.out.println(e.fillInStackTrace());
            }
        } while (true);

    }
}
