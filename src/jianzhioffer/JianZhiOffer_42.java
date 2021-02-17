package jianzhioffer;

public class JianZhiOffer_42 {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
    public static int maxSubArray(int[] nums) {
        if(nums==null||nums.length==0)
            return 0;
        if(nums.length==1)
            return nums[0];
        int temp=nums[0],max=temp;
        for(int i=1;i<nums.length;i++){
            if(temp<=0){
                temp=nums[i];
            }else {
                temp+=nums[i];
            }
            max=Math.max(temp,max);
        }
        return max;
    }

}
