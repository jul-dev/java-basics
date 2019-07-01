package LearningPackage.ThinkJava;

public class Char {
    public static void main(String[] args) {



    System.out.print("Greek alphabet: ");
for (int i = 913; i <= 937; i++) {
        System.out.print((char) i);
    }
System.out.println();

        System.out.print("Roman alphabet: ");
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.print(c);
        }
        System.out.println();

        String text = "Computer Science is fun!";
        text = text.replace("Computer Science", "CS");
        System.out.println(text);

}
}