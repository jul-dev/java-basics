package LearningPackage.polymorphism;

public class Animal {
    private String breed;
    private String name;
    private String DOB;

    Animal(){
        breed="coco";
        name="";
        DOB="";
    }

    public String toString(){
        String s= "breed: " + breed + " name: " + name + " DOB " + DOB;
        return s;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public void animalSound(){
        System.out.println("The animal makes a sound");
    }
}
