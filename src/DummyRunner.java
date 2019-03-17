public class DummyRunner {
    private static Dummy [] arr=new Dummy[5];

    public static void main(String[] args) {


        //Dummy.staticMethod();
        Dummy ob1=new Dummy();
        Dummy ob2=new Dummy();
        Dummy ob3=new Dummy();
        Dummy ob4=new Dummy();


        ob1.planet="Moon";
        ob2.planet="Sun";
        ob3.planet="Mars";
        ob4.planet="Pluto";


        System.out.println(ob1.planet);
        System.out.println(ob2.planet);
        System.out.println(ob3.planet);
        System.out.println(ob4.planet);


//        createObjects();
      //printDummies();


    }

    private static void createObjects() {
        Dummy o1=new Dummy();
        Dummy o2=new Dummy();
        Dummy o3=new Dummy();
        Dummy o4=new Dummy();
        Dummy o5=new Dummy();

        o1.age=1;
        o1.name="Anton";

        o2.age=2;
        o2.name="Ozik";

        o3.age=3;
        o3.name="Tishka";

        o4.age=4;
        o4.name="Jack";

        o5.age=5;
        o5.name="Pinya";

        arr [0]=o1;
        arr [1]=o2;
        arr [2]=o3;
        arr [3]=o4;
        arr [4]=o5;
    }
    private static void printDummies(){
        for (Dummy p:arr){
            System.out.println("Name:"+" " + p.name +", "+" "+ "Age:"+" " + p.age);
        }

    }
}
