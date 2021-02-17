package jianzhioffer;

public class JianZhiOffer_51 {
    public static void main(String[] args) {
        System.out.println(reversePairs(new int[]{7,5,6,4}));
    }
    public static int reversePairs(int[] nums) {
        if(nums==null||nums.length<2)
            return 0;
        int res=0;
        for(int i=0;i<nums.length;i++)
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j])
                    res++;
            }
        return res;
    }
}
