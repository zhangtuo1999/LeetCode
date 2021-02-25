package leetcode;

public class LC0283 {
    public static void main(String[] args) {
    }
    public static void moveZeroes(int[] nums) {
        if(nums.length<2)
            return ;
        int k=0;
        for(int num:nums){
            if(num!=0)
                nums[k++]=num;
        }
        while (k<nums.length){
            nums[k++]=0;
        }
    }
}
