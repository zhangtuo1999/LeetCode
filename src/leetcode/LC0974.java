package leetcode;

import java.util.HashMap;

public class LC0974 {
    public static void main(String[] args) {
        System.out.println(subarraysDivByK(new int[]{4, 5, 0, -2, -3, 1}, 5));
    }

    public static int subarraysDivByK(int[] A, int K) {
        if(A.length==0)
            return -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int count = 0, presum = 0;
        for (int a : A) {
            presum += a;
            int key = (presum % K + K) % K;
            if (map.containsKey(key))
                count += map.get(key);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        return count;
    }
}
