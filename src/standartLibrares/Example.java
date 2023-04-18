package standartLibrares;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Example {
    public static void main(String[] args) {
        Calendar cl = Calendar.getInstance();
        cl.set(Calendar.YEAR,1995);
        cl.set(Calendar.MONTH, Calendar.MAY);
        cl.set(Calendar.DAY_OF_MONTH, 23);
        Date javaDay = cl.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
        String result = sdf.format(javaDay);
        System.out.println("The JAVA day 23.05.1995 is "+ result);


    }
}
