package utils;

import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 处理时间的工具类
 */
public class TimeUtils {

    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");

    /**
     * 毫秒转成分钟
     * @param millis 毫秒
     * @return
     */
    public static String millisToMinutes(int millis) {
        //秒
        int secondsStart = millis / 1000;
        int secondsEnd = millis % 1000;
        secondsStart = secondsEnd >= 500 ? secondsStart+1 : secondsStart;
        //秒转成分钟
        int minuteStart = secondsStart / 60;
        int minuteEnd = (secondsStart % 60);
        String res = minuteStart + ":" + (minuteEnd >= 10 ? minuteEnd : "0" + minuteEnd);

//        System.out.println(res);
        return res;
    }

    /**
     * 把毫秒转成分钟
     * @param i 毫秒
     * @return 返回字符串类型的分钟显示
     */
    public static String handleSecond(int i) {
        //得到秒
        int s = i / 1000;
        //如果毫秒转成秒，余数大于500，加一秒
        if (s % 1000 > 500)
            s += 1;
        //得到分钟
        int m = s / 60;
        //处理分钟后面的余数，如果余数小于10，前面加个零
        String res = s % 60 < 10 ? "0"+s%60 : s%60+"";
        return m + ":" + res;
    }//handleSecond(double d) over

    /**
     * 把分钟变成秒
     * @return
     */
    public static double getMillis(double minute) {
        //得到秒 a:b
        double a = Integer.parseInt(String.format("%.0f", minute));
        double b = minute - a;
        double s = minute * a + b;
        //得到毫秒
        double m = s * 1000;
        return m;
    }//getMillis

    public static String getCurrDate() {
        return sdf.format(new Date());
    }
}
