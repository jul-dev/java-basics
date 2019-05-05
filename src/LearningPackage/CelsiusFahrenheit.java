package LearningPackage;
//
import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;
//
public class CelsiusFahrenheit {
   public static void main(String[] args) {
////        //Practicing Java
////        System.out.println("Hello World");
////        System.out.println("How are you doing?");
////
////        java.util.Scanner sc=new java.util.Scanner(System.in);
////        String uInput=sc.nextLine();
//
//        String name;
//        Integer age;
//        Scanner in=new Scanner(System.in);
//        while (true){
//            try {
//                System.out.print("What is your age? ");
//                age = in.nextInt();
//                in.nextLine();
//                System.out.print("What is your name? ");
//                name = in.nextLine();
//                System.out.printf("Hello %s, age %d\n", name, age);
//                break;
//
//            } catch (InputMismatchException e){
//               // e.printStackTrace();
//                System.out.println("Enter integers only");
//                in.nextLine();
       while (true){
           try {
               System.out.println("Enter the temp outside in Celsius");
               Scanner in = new Scanner (System.in);
               String s= in.nextLine().toLowerCase();
               if (s.equals("exit"))break;
               double cel= Double.parseDouble(s);
               double fah = cel * 9/5 + 32;
               System.out.printf("The temperature in Fahrenheit is = %.2f ", fah);

           }catch (InputMismatchException e){
               System.out.println("Pleas enter the temperature using digits");

           }catch (Exception e){
               e.printStackTrace();

           }

       }





//
//
//            }
//        }
//
   }
}
