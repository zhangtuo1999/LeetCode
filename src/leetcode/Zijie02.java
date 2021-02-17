package leetcode;

import java.util.Arrays;

public class Zijie02 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(runningSum(new int[]{1,2,3,4})));
        System.out.println(Arrays.toString(runningSum(new int[]{1})));
    }
    public static int[] runningSum(int[] nums) {
        if(nums==null||nums.length<=1)
            return nums;
        int[] res= new int[nums.length];
        res[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            res[i]=res[i-1]+nums[i];
        }
        return res;
    }
}
