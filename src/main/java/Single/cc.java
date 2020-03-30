package Single;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class cc {

    public static void main(String[] args) throws ParseException {
//        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
////        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Date a = df.parse("2020-03-06 00:00:00.0");
//        Date b = df.parse("Sat Mar 07 23:59:59 CST 2020");
////        String s = sdf.format(a);
//        String x = dateFormat.format(b);
//        System.out.println(x);

        String a =  "Sat Mar 07 23:59:59 CST 2020";
        SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss Z yyyy", Locale.US);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date sds = sdf.parse(a);
            Date ds1 = dateFormat.parse("2020-03-06 00:00:00.0");
            String sdsa = dateFormat.format(sds);
            System.out.println(sdsa);
        } catch (ParseException ex) {
//            Logger.getLogger(JavaApplication1.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
    }

}
