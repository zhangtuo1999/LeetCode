package leetcode;

import java.util.Arrays;

public class LC0506 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findRelativeRanks(new int[]{5, 4, 3, 2, 1})));
        System.out.println(Arrays.toString(findRelativeRanks(new int[]{3, 4, 5, 2, 1})));
        System.out.println(Arrays.toString(findRelativeRanks(new int[]{4, 3, 2, 1})));
        System.out.println(Arrays.toString(findRelativeRanks(new int[]{})));
    }
    public static String[] findRelativeRanks(int[] score) {
        int[] temp=Arrays.copyOf(score,score.length);
        Arrays.sort(score);
        String[] res=new String[score.length];
        for(int i=0;i<score.length;i++){
            int index= score.length-Arrays.binarySearch(score,temp[i])-1;
            if(index==0){
                res[i]="Gold Medal";
            }else if (index==1){
                res[i]="Silver Medal";
            }else if(index==2){
                res[i]="Bronze Medal";
            }else {
                res[i]=String.valueOf(index+1);
            }
        }
        return res;
    }
}
