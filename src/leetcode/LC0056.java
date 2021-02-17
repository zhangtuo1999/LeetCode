package leetcode;

import java.util.Arrays;

public class LC0056 {
    public static void main(String[] args) {
//        int[][] in={{1,3},{2,6},{8,10},{15,18}};
//        int[][] in={{1,4},{2,3}};
        int[][] in={{1,4}};
        int[][] arr=merge(in);
        for(int[] i:arr){
            for(int ii:i){
                System.out.println(ii);
            }
            System.out.println();
        }
    }
    public static int[][] merge(int[][] intervals) {

        int[][] res=new int[intervals.length][2];
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        res[0][0]=intervals[0][0];
        res[0][1]=intervals[0][1];
        int num=0;
        for(int i=1;i<intervals.length;i++){
            if(res[num][1]>=intervals[i][0]){  //有重叠
                if(res[num][1]<intervals[i][1])
                    res[num][1]=intervals[i][1];
            }else{
                num++;
                res[num][0]=intervals[i][0];
                res[num][1]=intervals[i][1];
            }
        }

        return Arrays.copyOf(res,num+1);
    }
}
