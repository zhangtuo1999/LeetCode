package jianzhioffer;

import java.util.Arrays;

public class JianZhiOffer_21 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(exchange(new int[]{1,2,3,4,5,6})));
    }
    public static int[] exchange(int[] nums) {
        int i=0,j=nums.length-1;
        while(i<=j){
            if(!isFlag(nums[i])&&isFlag(nums[j])){//偶奇
                swap(nums,i,j);
                i++;
                j--;
            }else if(isFlag(nums[i])&&!isFlag(nums[j])){    //奇偶
                i++;
                j--;
            }else if(!isFlag(nums[i])&&!isFlag(nums[j])){   //偶偶
                j--;
            }else { //奇奇
                i++;
            }
        }
        return nums;
    }

    private static void swap(int[] nums, int i, int j) {
        int tmp=nums[i];
        nums[i]=nums[j];
        nums[j]=tmp;
    }

    private static boolean isFlag(int i) {
        return i % 2 != 0;  //奇数true
    }
}
