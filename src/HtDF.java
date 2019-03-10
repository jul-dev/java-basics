import java.util.Scanner;

import static java.util.Scanner.*;

public class HtDF {

    public static void main(String[] args) {

        String msg = "";
        int age=0;
        boolean isAllowedToDrink = false;

        while(true) {
            age = readUserAge();
            isAllowedToDrink = isDrinkingAllowed(age);

            if (isAllowedToDrink) {
                msg = "Since you are " + age + " years old you can have a drink";
            } else {
                msg = "Since you are " + age + " years old you can't drink. Go home, drink you milk";
            }

            System.out.println(msg);
        }
    }

    private static int readUserAge() {
        Scanner reader =  new Scanner(System.in);
        System.out.println("Please enter your age:");
            int age = reader.nextInt();
            return age;


    }


    private static boolean isDrinkingAllowed(int age) {
        // Signature : Int -> Bool
        // Purpose : Determine if your age allows you drink . 21 or older allowed.
        // isDrinkingAllowed n return type bool
        if (age < 21){
            return false; }
        else {
            return true;
        }




}


}
