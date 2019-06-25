package LearningPackage.abstraction;


class Airplane implements IMovable, IEnergy{

    private String name;
    private String model;

    public Airplane(String name, String model) {
        this.name = name;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void move() {
        System.out.println("Airplane "+ name + " flew 3,100 miles");
    }

    @Override
    public void getEnergy() {
        System.out.println("Airplane uses fuel");

    }
}
