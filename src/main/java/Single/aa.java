package Single;

import java.util.Calendar;

public class aa {

    public static void main(String[] args) {
        String a = getLastDayOfMonth("2020-02");
        System.out.println(a);
    }

    public static String getLastDayOfMonth(String yearMonth) {

        String[] yearSplit = yearMonth.split("-");
        String year = yearSplit[0];
        String month = yearSplit[1];
        StringBuilder sb = new StringBuilder();
        Calendar cal = Calendar.getInstance();
        //年
        cal.set(Calendar.YEAR, Integer.parseInt(year));
        //月，因为Calendar里的月是从0开始，所以要-1
        cal.set(Calendar.MONTH, Integer.parseInt(month) - 1);
        //日，设为一号
        cal.set(Calendar.DATE, 1);
        //月份加一，得到下个月的一号
        cal.add(Calendar.MONTH,1);
        //下一个月减一为本月最后一天
        cal.add(Calendar.DATE, -1);
        return sb.append(year).append("-").append(month).append("-").append(String.valueOf(cal.get(Calendar.DAY_OF_MONTH))).toString();
    }





}
