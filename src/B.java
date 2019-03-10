package com.company;

public class B {
    public static void main(String[] args) {

       int time = 22;
//        timeOfDay(time);

        System.out.println(timeOfDay(time));
    }

    public static String timeOfDay(int time) {
        String timeofday="";
        //morning 5am-11am
        if(time >= 5&& time <11){
            timeofday="Morning";
//            System.out.println("its freaking morning time");
        }

        //day 11am=17pm
        else if(time>=11 && time<17){
            timeofday="Day";
//            System.out.println("its day time");
        }
        //evening 17pm-22pm
        else if(time>=17&&time<22){
            timeofday="Evening";
//            System.out.println("its the evening ");
        }
        //night 22pm-5am
        else{
            timeofday="Night";
//            System.out.println("its night");
        }
        return timeofday;
    }

    static String seasonOfYear(int month) {
        String season="";
        switch(month){
            case 3:
            case 4:
            case 5:
//                System.out.println("Spring");
                season="Spring";
                break;
            case 6:
            case 7:
            case 8:
//                System.out.println("Summer");
                season="Summer";
                break;
            case 9:
            case 10:
            case 11:
//                System.out.println("Fall");
                season="Fall";
                break;
            case 12:
            case 1:
            case 2:
//                System.out.println("Winter");
                season="Winter";
                break;
        }
        return season;
    }
}
