package newcoder;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Date;

public class N002 {
    public static void main(String[] args) {
        //System.out.println(workdays_between(2020,9,25,2020,9,28));
        System.out.println(workdays_between(1,1,1,2019,9,25));
        /**
         * 链接：https://www.nowcoder.com/questionTerminal/6e0db09b8ea743c9811f85083562da56?answerType=1&f=discussion
         * 来源：牛客网
         *
         * 您的代码已保存
         * 答案错误:您提交的程序没有通过所有的测试用例
         * case通过率为45.00%
         *
         * 用例:
         * 1,1,1,2019,9,25
         *
         * 对应输出应该为:
         *
         * 526662
         *
         * 你的输出为:
         *
         * 526663
         */
    }
    public static int workdays_between (int y1, int m1, int d1, int y2, int m2, int d2) {
        // write code here
        Date date1 = new Date(y1-1900, m1-1, d1);
        Date date2 = new Date(y2-1900, m2-1, d2);
        long sec = Math.abs(date1.getTime() - date2.getTime());

        long date= sec/(1000 * 60 * 60 *24);
        int res=(int) (date/7)*5; //周数*5
        long remain=date%7;  //余下天数
        long now= ((date2.getTime()/(1000 * 60 * 60 *24))+5)%7;//当前星期几
        for(long i=1;i<=remain;i++){
            if((now-i+7)%7!=0&&(now-i+7)%7!=6){
                res++;
            }
        }
        return res;
    }
}
