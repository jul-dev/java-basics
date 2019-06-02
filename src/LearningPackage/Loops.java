package LearningPackage;

public class Loops {
    private static  int [] createNumberArray(int num){
         int[] numbers = new int[num];

        for(int i=2; i< numbers.length; i+=2)
            numbers[i]=i;
            return numbers;
    }

    public static void main(String[] args) {
        for (int i: createNumberArray(100))
            System.out.println(i);
        //forPrint(createNumberArray(100));

    }

    private static void forEachPrint(int [] arr) {
        for (int i: arr) {
            if ((i % 3 == 0) && (i % 5 == 0)){
                System.out.println("MEOW " + i);
                continue;
            }
            else if (i % 3 == 0)
                System.out.println("Hurray " + i);
            else if (i % 5 == 0)
                System.out.println("Wow " + i);

        }
    }

    private static void forPrint(int [] arr){
        for (int i=0; i< arr.length; i++){
            if ((i % 3 == 0) && (i % 5 == 0)){
                System.out.println("MEOW " + i);
                continue;
            }
            if (i % 3 == 0) {
                System.out.println("Hurray " + i);
                continue;
            }
            if (i % 5 == 0)
                System.out.println("Wow " + i);

        }
    }
}
