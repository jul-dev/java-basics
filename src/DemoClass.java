import java.util.Calendar;

public class DemoClass {

    public static String currentSeason(){
        Calendar cal = Calendar.getInstance();
        int month = cal.get(Calendar.MONTH) +1;
        System.out.printf("Current month %d%n", month);
        String season="";

        switch (month){
            case 1: case 2: case 12://Jan, Feb, Dec
            season="Winter";
            break;
            case 3: case 4: case 5: //Mar, Apr, May
            season="Spring";
            break;
            case 6: case 7: case 8: //Jun, Jul, Aug
            season="Summer";
            break;
            case 9: case 10: case 11: //Sep, Oct, Nov
            season="Fall";
        }/* end switch */
    return season;
    }
}
