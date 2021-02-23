package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC0015 {
    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
        System.out.println(threeSum(new int[]{}));
        System.out.println(threeSum(new int[]{0, 0, 0, 0, 0}));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        if (nums.length < 3)
            return lists;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) return lists;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int j = i + 1, k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    lists.add(temp);
                    while (j < k && nums[j + 1] == nums[j]) j++;
                    while (j < k && nums[k - 1] == nums[k]) k--;
                    j++;
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return lists;
    }
}
