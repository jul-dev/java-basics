package LearningPackage;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    do {
        try {
            System.out.println("Enter first num: ");
            int n1 = sc.nextInt();
            System.out.println("Enter second num: ");
            int n2 = sc.nextInt();
            int sum = n1 / n2;
            System.out.println(sum);
            break;
        } catch (InputMismatchException e){
            System.out.println("You can only enter int");
            sc.next();
        } catch (Exception e){
            System.out.println("You cant do that");
        }}while (true);
        sc.close();
    }







}

