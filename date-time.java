import java.text.*;
import java.util.*;
class datetime {
    public static void main(String args[])
    {
        SimpleDateFormat formatDate = new SimpleDateFormat(
            "dd/MM/yyyy  HH:mm:ss z");
 
        Date date = new Date();
        // initialize "Date" class
 
        formatDate.setTimeZone(TimeZone.getTimeZone("IST"));
        // converting to IST or format the Date as IST
 
        System.out.println(formatDate.format(date));
        // print formatted date and time
    }
}