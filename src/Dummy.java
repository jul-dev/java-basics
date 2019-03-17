public class Dummy {
    String name;
    int age;
    public String planet="Earth";

    public static void staticMethod(){
        System.out.println("i'm static");
        //System.out.println("My planet is: " + planet);
    }
    public void noneStaticMethod(){
        System.out.println("i'm not static!");
    }
}
