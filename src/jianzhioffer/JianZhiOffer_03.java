package jianzhioffer;

import java.util.HashSet;
import java.util.Set;

public class JianZhiOffer_03 {
//    剑指 Offer 03. 数组中重复的数字
//    找出数组中重复的数字。
//    在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，
//    但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
    public static void main(String[] args) {
        int[] nums={2, 3, 1, 0, 2, 5, 3};
        System.out.println(findRepeatNumber(nums));
    }

    private static int findRepeatNumber(int[] nums) {

        //空指针和空数组
        if(nums==null||nums.length<=0)
            return -1;
        //非法数据
        for(int num:nums){
            if(num<0||num>nums.length-1)
                return -1;
        }

        //原地置换
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i){
                if(nums[i]==nums[nums[i]])
                    return nums[i];
                else
                   swap(nums,i,nums[i]);
            }
        }
        return -1;
    }

    private static void swap(int[] nums, int i, int num) {
        int temp=nums[i];
        nums[i]=nums[num];
        nums[num]=temp;
    }

//    public static int findRepeatNumber(int[] nums) {
//        Set<Integer> set =new HashSet<Integer>();
//        for(int i=0;i<nums.length;i++){
//            if(!set.add(nums[i])){
//                return nums[i];
//            }
//        }
//        return 0;
//    }

}
