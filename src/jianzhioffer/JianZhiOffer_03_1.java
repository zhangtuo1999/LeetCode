package jianzhioffer;

public class JianZhiOffer_03_1 {
    public static void main(String[] args) {
        int[] nums={2,3,5,4,3,2,6,7};
        System.out.println(findRepeatNumber(nums));
    }

    private static int findRepeatNumber(int[] nums) {
        //二分
        int start= 1;
        int end=nums.length-1;
        while(end>=start){
            int mid=(end-start)/2+start;
            int count=countRange(nums,start,mid);

            if(end==start){
                if(count>1)
                    return start;
                else
                    break;
            }

            if(count>(mid-start+1))
                end=mid;
            else
                start=mid+1;

        }
        return -1;
    }

    private static int countRange(int[] nums, int start, int end) {
        int count=0;
        for (int num : nums) {
            if (num >= start && num <= end)
                count++;
        }
        return count;
    }

//    private static int findRepeatNumber(int[] nums) {
//        //空指针和空数组
//        if(nums==null||nums.length<=0)
//            return -1;
//        //非法数据
//        for(int num:nums){
//            if(num<1||num>nums.length)
//                return -1;
//        }
//        //初始化
//        int[] nums1=new int[nums.length];
//
//        for(int i=0;i<nums.length;i++)
//            nums1[i]=-1;
//        //复制到新数组
//        for(int i=0;i<nums.length;i++){
//            if(nums1[i]!=-1)
//                nums1[nums[i]] = nums[i];
//            else
//                return nums[i];
//        }
//        return -1;
//    }

}
