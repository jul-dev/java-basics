import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        for (String a : args
             ) {
            System.out.println(a);
        }

        DemoClass demoClass = new DemoClass();
        String season = demoClass.currentSeason();
        System.out.println("Current season is : "  + season);

        Person person=new Person("Female","Julia", "Kovrigina");
        person.setDOB(1983, 12,22);
        person.setSSN("123-45-6789");

        displayPerson(person);

    }

    static void displayPerson(Person person){
        System.out.println("\n Here is information about " + person.getFname() + " " + person.getLname());
        System.out.println("\t DOB: " + person.getDOB());
        System.out.println("\t Gender: " + person.getGender());
        System.out.println("\t SSN: " + person.getSSN());

    }


}
