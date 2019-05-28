package LearningPackage.DrRacket;

public class MyImageApp {
    public static void main(String[] args) {

        /*
        (check-expect (is-img1-larger? (rectangle 20 30 "outline" "pink") (rectangle 30 40 "outline" "blue")) false)
        (check-expect (is-img1-larger? (rectangle 50 60 "outline" "black") (rectangle 10 20 "solid" "red")) true)
        (check-expect (is-img1-larger? (rectangle 50 60 "outline" "black") (rectangle 50 60 "solid" "red")) false)
        (check-expect (is-img1-larger? (rectangle 50 20 "outline" "black") (rectangle 89 21 "solid" "red")) false)

        (check-expect (is-img1-larger? (rectangle 50 13 "outline" "black") (rectangle 21 89 "solid" "red")) false)
        (check-expect (is-img1-larger? (rectangle 30 60 "outline" "black") (rectangle 25 60 "solid" "red")) false)
        (check-expect (is-img1-larger? (rectangle 60 90 "outline" "black") (rectangle 70 60 "solid" "red")) false)
        (check-expect (is-img1-larger? (rectangle 10 20 "outline" "black") (rectangle  60 5 "solid" "red")) false)
        (check-expect (is-img1-larger? (rectangle 10 20 "outline" "black") (rectangle  10 30 "solid" "red")) false)
*/
        assert isImg1Larger(new MyImage(20,30), new MyImage(30,40))==false;
        assert isImg1Larger(new MyImage(50,60), new MyImage(10,20))==true;
        assert isImg1Larger(new MyImage(50,60), new MyImage(50,60))==false;
        assert isImg1Larger(new MyImage(50,20), new MyImage(89,21))==false;

        assert isImg1Larger(new MyImage(20,30), new MyImage(30,40))==false;
        assert isImg1Larger(new MyImage(20,30), new MyImage(30,40))==false;
        assert isImg1Larger(new MyImage(20,30), new MyImage(30,40))==false;
        assert isImg1Larger(new MyImage(20,30), new MyImage(30,40))==false;
        assert isImg1Larger(new MyImage(20,30), new MyImage(30,40))==false;

    }
    // Image Image -> boolean
    // takes img1 and img2 and produces true if img1 is great(both width and height have to be grater).
    static boolean isImg1Larger(MyImage img1, MyImage img2){
        if ((img1.getWidth() > img2.getWidth())&&(img1.getHeight()> img2.getHeight()))
            return true;
        return false;



    }
}

