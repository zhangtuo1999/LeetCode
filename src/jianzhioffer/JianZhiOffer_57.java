package jianzhioffer;

import java.util.Arrays;
import java.util.HashSet;

public class JianZhiOffer_57 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2,7,11,15},9)));
        System.out.println(Arrays.toString(twoSum(new int[]{10,26,30,31,47,60},40)));
        System.out.println(Arrays.toString(twoSum(new int[]{},40)));
    }
    public static int[] twoSum(int[] nums, int target) {

        HashSet<Integer> set =new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!set.contains(target-nums[i])){
                set.add(nums[i]);
            }else {
                return new int[]{nums[i],target-nums[i]};
            }
        }
        return new int[0];
    }
}
