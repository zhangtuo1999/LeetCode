package leetcode;

public class LC0724 {
    public static void main(String[] args) {

    }

    public static int pivotIndex(int[] nums) {
        if(nums.length<2)
            return -1;
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        int cur=0;
        for(int i=0;i<nums.length;i++){
            if(cur==sum-nums[i]-cur)
                return i;
            cur+=nums[i];
        }
        return -1;
    }
}
