package Single;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class bb {

    //节假日列表
    private static List<Calendar> holidayList = new ArrayList<Calendar>();
    //周末为工作日
    private static List<Calendar> weekendList = new ArrayList<Calendar>();

    public static void main(String[] args) throws Exception {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
//        DateFormat df = new SimpleDateFormat("yyyy-MM");
//        DateFormat df = new SimpleDateFormat("yyyy");
        Calendar ca = Calendar.getInstance();
        String startTimes = "2020-03-25";
        String endTimes = "2021-03-25";
        String formatReport = "1";
        getColumnWorkDayDate(startTimes,endTimes);
        System.out.println();
    }
    public static List<String> getColumnWorkDayDate(String startTimes, String endTimes) throws Exception {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date startTime = df.parse(startTimes);
        Date endTime = df.parse(endTimes);
        Calendar ca = Calendar.getInstance();
        String dateFormat = "yyyy-MM-dd";
        int amount = Calendar.DATE;
        Calendar startTimeCalendar = Calendar.getInstance();// 定义日期实例
        Calendar endTimeCalendar = Calendar.getInstance();// 定义日期实例
        startTimeCalendar.setTime(startTime);// 设置日期起始时间
        endTimeCalendar.setTime(endTime);
        ArrayList<String> dates = new ArrayList<String>();
        while (!startTimeCalendar.after(endTimeCalendar)) {// 判断是否到结束日期
            SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
            String str = sdf.format(startTimeCalendar.getTime());
            Date d = df.parse(str);
            ca.setTime(d);
            if(checkHoliday(ca)){
                dates.add(str);
            }
            startTimeCalendar.add(amount, 1);// 进行当前日期月份加1
        }
        for (String d:
             dates) {
            System.out.println("=="+d);
        }
        System.out.println(dates.size());
        return dates;
    }


    /**
     *
     * 验证日期是否是节假日
     * @param calendar  传入需要验证的日期
     * @return
     * return boolean    返回类型  返回true是节假日，返回false不是节假日
     * throws
     */
    public static boolean checkHoliday(Calendar calendar) throws Exception{

        //判断日期是否是周六周日
        if(calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY ||
                calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY){

            //判断日期是否是节假日
            for (Calendar ca : weekendList) {
                if(ca.get(Calendar.MONTH) == calendar.get(Calendar.MONTH) &&
                        ca.get(Calendar.DAY_OF_MONTH) == calendar.get(Calendar.DAY_OF_MONTH)&&
                        ca.get(Calendar.YEAR) == calendar.get(Calendar.YEAR)){
                    return false;
                }
            }

            return true;
        }
        //判断日期是否是节假日
        for (Calendar ca : holidayList) {
            if(ca.get(Calendar.MONTH) == calendar.get(Calendar.MONTH) &&
                    ca.get(Calendar.DAY_OF_MONTH) == calendar.get(Calendar.DAY_OF_MONTH)&&
                    ca.get(Calendar.YEAR) == calendar.get(Calendar.YEAR)){
                return true;
            }
        }

        return false;
    }

    /**
     *
     * 把所有节假日放入list
     * @param date  从数据库查 查出来的格式2016-05-09
     * return void    返回类型
     * throws
     */
    public void initHolidayList(String date){

        String [] da = date.split("-");

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, Integer.valueOf(da[0]));
        calendar.set(Calendar.MONTH, Integer.valueOf(da[1])-1);//月份比正常小1,0代表一月
        calendar.set(Calendar.DAY_OF_MONTH, Integer.valueOf(da[2]));
        holidayList.add(calendar);
    }

    /**
     * 初始化周末被调整为工作日的数据
     */
    public void initWeekendList(String date){
        String [] da = date.split("-");

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, Integer.valueOf(da[0]));
        calendar.set(Calendar.MONTH, Integer.valueOf(da[1])-1);//月份比正常小1,0代表一月
        calendar.set(Calendar.DAY_OF_MONTH, Integer.valueOf(da[2]));
        weekendList.add(calendar);
    }






}
