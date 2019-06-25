package LearningPackage.abstraction;

public class App{

    public static void main(String[] args) {

        IMovable [] arr= new IMovable [10];

        Airplane air=new Airplane("Boeing", "Max9");
        Person per=new Person("Julia", 187);
        Bird bir=new Bird("Amy", "Crow");
        Train tran=new Train("XC7000", "NYC");

       arr [0]=air;
       arr [1]= per;
       arr [2]=bir;
       arr [3]=tran;

       arr[4]=new Airplane("WOW2","FX100");
       arr[5]=new Person("Andrew2", 200);
       arr[6]=new Bird("Robin2", "Robin");

        for (IMovable o : arr) {
           if (o != null ){
               o.move();
               ((IEnergy) o).getEnergy();

//               if (o instanceof Airplane){
//                   ((IEnergy) o).getEnergy();
//               }
           }
        }

        Airplane a=(Airplane) arr[0];
        System.out.println(a.getName());


    }
}
