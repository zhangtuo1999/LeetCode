package leetcode;

import java.util.HashMap;

public class LC1248 {
    public static void main(String[] args) {
        System.out.println(numberOfSubarrays(new int[]{1,1,2,1,1},3));
        System.out.println(numberOfSubarrays(new int[]{2,4,6},1));
        System.out.println(numberOfSubarrays(new int[]{2,2,2,1,2,2,1,2,2,2},2));
    }
    public static int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int count=0,presum=0;
        for (int num:nums){
            presum+=num%2;
            if(map.containsKey(presum-k))
                count+=map.get(presum-k);
            map.put(presum,map.getOrDefault(presum,0)+1);
        }
        return count;
    }
}
