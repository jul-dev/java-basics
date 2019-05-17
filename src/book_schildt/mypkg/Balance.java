package book_schildt.mypkg;

 public class Balance {
    String name;
    double amount;

   public Balance(){
        name = "none";
        amount=-111;
    }

    public void show() {
        System.out.println("name: "+ name + "\namount: "+ amount);
    }
}
