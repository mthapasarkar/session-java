package day10;



import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
;

public class Predefined {
    public static void main(String[] args) {
//     Date

        Date currentDate = new Date();
        System.out.println(currentDate);

        Date specificDate = new Date(1661441623799l);
        System.out.println(specificDate);

 // Calendar
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

        Calendar birthCalendar = Calendar.getInstance();
        birthCalendar.set(Calendar.YEAR, 1989);
        birthCalendar.set(Calendar.MONTH ,7);
        birthCalendar.set(Calendar.DAY_OF_MONTH,10);
        System.out.println(birthCalendar);

// if / else
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();

        c2.set(1989 , 7 ,10);

        System.out.println(" Calendar 1 :" + c1.getTime());
        System.out.println(" Calendar 2 " + c2.getTime());

        if (c1.equals(c2))
        {
            System.out.println(" Both Calendar are equal");
        }
        else {
            System.out.println(" Both Calendar are not equal");
        }

// Today
        GregorianCalendar today = new GregorianCalendar();
        int day = today.get(Calendar.DATE);
        int month = today.get(Calendar.MONTH);
        month ++;
        int year = today.get(Calendar.YEAR);
        System.out.println("Today's date is " + month + "/");
        System.out.println( day + "/");
        System.out.println( year + ".");








    }
}
