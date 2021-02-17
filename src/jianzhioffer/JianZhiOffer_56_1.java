package jianzhioffer;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class JianZhiOffer_56_1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(singleNumbers(new int[]{1, 2, 10, 4, 1, 4, 3, 3})));
    }
    public static int[] singleNumbers(int[] nums) {
        if(nums.length<2) return nums;
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            if(set.contains(num))
                set.remove(num);
            else set.add(num);
        }
        int[] res=new int[2];
        Iterator<Integer> it=set.iterator();
        res[0]=it.next();
        res[1]=it.next();
        return res;
    }
}
