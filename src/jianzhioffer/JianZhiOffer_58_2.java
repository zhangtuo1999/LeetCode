package jianzhioffer;

public class JianZhiOffer_58_2 {
    public static void main(String[] args) {
        System.out.println(reverseLeftWords("abcdefg",2));
        System.out.println(reverseLeftWords("",2));
        System.out.println(reverseLeftWords("lrloseumgh",6));
    }
    public static String reverseLeftWords(String s, int n) {
        if(s==null||s.length()==0) return s;
        String res="";
        res+=s.substring(n);
        res+=s.substring(0,n);
        return res;
    }
}
