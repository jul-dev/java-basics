package LearningPackage;

// Create a MyClass class
public class Dummy {
    public int x; // Create a class attribute
    private String name;
    int y;

    // Create a class constructor for the MyClass class
    public Dummy() {
        x = 5;  // Set the initial value for the class attribute x
    }
    public Dummy(String n) {
        name = "Nata";  // Set the initial value for the class attribute x
    }
    public Dummy(int x,int y,String name ) {
        this.x=x;
        this.y=y;
        this.name=name;
    }
    //Getter
    public String getName(){
        return name;
    }
    //Setter
    public void setName(String name){
        this.name=name;
    }


}