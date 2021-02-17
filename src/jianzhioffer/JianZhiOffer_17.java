package jianzhioffer;

public class JianZhiOffer_17 {
    public static void main(String[] args) {

    }
    public static int[] printNumbers(int n) {
        int max=1;
        for(int i=0;i<n;i++)
            max*=10;
        int[] res=new int[max-1];
        for(int i=1;i<max;i++)
            res[i-1]=i;
        return res;
    }
}
