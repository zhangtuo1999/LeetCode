package leetcode;

import java.util.HashSet;

public class LC0003 {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        char[] chs=s.toCharArray();
        int max=0;
        int i=0,j=0;
        while (i<chs.length&&j<chs.length){
            if(set.add(chs[j])){
                j++;
            }else{
                set.remove(chs[i++]);
            }
            max=Math.max(set.size(), max);
        }
        return max;
    }
}

