package jianzhioffer;

public class JianZhiOffer_14_2 {
    public static void main(String[] args) {
        System.out.println(cuttingRope(2));
        System.out.println(cuttingRope(3));
        System.out.println(cuttingRope(4));
        System.out.println(cuttingRope(5));
        System.out.println(cuttingRope(6));
        System.out.println(cuttingRope(7));
        System.out.println(cuttingRope(500));
    }

    public static long cuttingRope(int n) {
        if(n<2) return 0;
        if(n==2) return 1;
        if(n==3) return 2;

        long res=1;
        while (n>4){
            res*=3;
            res%=1000000007;
            n-=3;
        }
        return (int)(res*n%1000000007);
    }
}
