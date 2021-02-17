package jianzhioffer;

import java.util.HashSet;

public class JianZhiOffer_61 {
    public static void main(String[] args) {
        System.out.println(isStraight(new int[]{1,2,3,4,5}));
        System.out.println(isStraight(new int[]{1,1,3,4,5}));
        System.out.println(isStraight(new int[]{0,0,3,4,5}));
    }
    public static boolean isStraight(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int max=0,min=14;
        for(int num:nums){
            if (num==0) continue;
            max=Math.max(num,max);
            min=Math.min(num,min);
            if(set.contains(num))
                return false;
            set.add(num);
        }
        return (max - min) < 5;
    }
}
