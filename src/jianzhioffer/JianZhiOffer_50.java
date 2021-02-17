package jianzhioffer;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class JianZhiOffer_50 {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("aadadaad"));
    }
    public static char firstUniqChar(String s) {
        LinkedHashSet<Character> set=new LinkedHashSet();
        HashSet<Character> hs=new HashSet<>();
        char[] chs=s.toCharArray();
        for(char ch:chs){
            if(!hs.contains(ch)){
                if(set.contains(ch)){
                    hs.add(ch);
                    set.remove(ch);
                }else {
                    set.add(ch);
                }
            }
        }
        if(set.isEmpty())
            return ' ';
        Iterator<Character> it= set.iterator();
        return it.next();
    }
}
