package newcoder;

import java.util.Scanner;

public class Zijie01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while (n>0){
            String s=sc.next();
            char[] chs=s.toCharArray();
            for(int i=0;i<s.length()-2;i++)
                if(s.charAt(i)==s.charAt(i+1)&&s.charAt(i)==s.charAt(i+2)){
                    while(i<s.length()-2&&s.charAt(i+2)==s.charAt(i))
                        s=remove(s,i+2);
                }
            for(int i=0;i<s.length()-3;i++)
                if(s.charAt(i)==s.charAt(i+1)&&s.charAt(i+2)==s.charAt(i+3))
                        s=remove(s,i+3);
            System.out.println(s);
            n--;
        }
    }

    private static String remove(String s, int i) {
        return s.substring(0, i) + s.substring(i + 1);
    }
}
