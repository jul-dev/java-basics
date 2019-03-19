package LearningPackage;
import java.util.Scanner;

public class DummyRunner{

public static void main(String[] args) {
        Dummy myObj = new Dummy(); // Create an object of class MyClass (This will call the constructor)
        System.out.println(myObj.x); // Print the value of x

        Dummy objname= new Dummy();
        objname.setName("Andrew");
        System.out.println(objname.getName());

        Dummy myobj1 = new Dummy(3,4,"Nata");
        System.out.println(myobj1.x);
        System.out.println(myobj1.y);

        Scanner objscan=new Scanner(System.in);
        System.out.println("Enter your age");

        String age=objscan.nextLine();
        System.out.println("Your age is: "+age);
        }

}
