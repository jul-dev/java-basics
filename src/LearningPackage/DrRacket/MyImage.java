package LearningPackage.DrRacket;

public class MyImage {

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    //fields
    private int width;
    private int height;

    //constructor
    public MyImage(int width, int height){
        this.width= width;
        this.height=height;
    }




}
