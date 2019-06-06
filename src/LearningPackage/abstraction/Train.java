package LearningPackage.abstraction;

class Train implements IMovable{

    public Train(String model, String destination) {
        this.model = model;
        this.destination = destination;
    }

    private String model;
    private String destination;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public void move() {
        System.out.println("Train " + model + " traveled 132 miles");
    }


}
