package LearningPackage;
import collegeapp.Person;

public class ThinkJava {
    public static void printTime(int hour, int minute) {
        System.out.print(hour);
        System.out.print(":");
        System.out.println(minute);
        hour=24;
        minute=15;
        System.out.println(hour+":"+ minute);

    }
//    public static void main(String[] args) {
//
//        String input = "1 fish 2 fish red fish blue fish";
//        Scanner s = new Scanner(input);
//        System.out.println(input);

        public static void main(String[] args) {
//            int hour = 11;
//            int minute = 59;
//            printTime(hour,minute);
//            System.out.println(hour+":"+ minute);

            Person p=new Person("f","Julia","Kov");
            System.out.println(p);
            changePerson(p);
            System.out.println(p);

            String s="Jul";
            changeString(s);
            System.out.println(s);
            System.out.println(p.getGender());

        }

        private static void changePerson(Person obj){
            obj.setFname("Andrew");
        }
        private static void changeString(String s){
            s=s+"ia";
            System.out.println("inside changeString "+s);


        }
}
