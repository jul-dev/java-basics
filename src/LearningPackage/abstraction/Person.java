package LearningPackage.abstraction;

class Person implements IMovable {

    public Person(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    private String name;
    private int weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void move() {
        System.out.println("Person " + name + " walked 8 miles");
    }
}
