package leetcode;


import java.util.HashMap;
import java.util.HashSet;

public class LC0560 {
    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{1, 1, 1}, 2));
    }

    //    public static int subarraySum(int[] nums, int k) {
//        int count=0;
//        for(int i=0;i<nums.length;i++){
//            int sum=0;
//            for(int j=i;j<nums.length;j++){
//                sum+=nums[j];
//                if(sum==k)
//                    count++;
//            }
//        }
//        return count;
//    }
    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int presum=0,count=0;
        for(int num:nums){
            presum+=num;
            if(map.containsKey(presum-k))
                count+=map.get(presum-k);
            map.put(presum,map.getOrDefault(presum,0)+1);
        }
        return count;
    }

}
