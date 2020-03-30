package Single;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class dd {
    public static void main(String[] args) throws ParseException {
        Map<String, Object> searchParams = new HashMap<>();
        searchParams.put("GTE_queryTime", "2020-03-06 00:00:00.0");
        searchParams.put("LTE_queryTime", "Sat Mar 07 23:59:59 CST 2020");
        SimpleDateFormat LTE_queryTime1 = new SimpleDateFormat("EEE MMM dd HH:mm:ss Z yyyy", Locale.US);
        SimpleDateFormat GTE_queryTime1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        Date start = GTE_queryTime1.parse((String) searchParams.get("GTE_queryTime"));
        Date end = LTE_queryTime1.parse((String) searchParams.get("LTE_queryTime"));
        String startTime = sdf1.format(start);
        String endTime = sdf1.format(end);
        System.out.println(endTime);


    }

}
