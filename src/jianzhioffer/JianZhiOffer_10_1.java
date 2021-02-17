package jianzhioffer;

public class JianZhiOffer_10_1 {
    public static int fib(int n) {
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        int f0=0,f1=1,next=0;
        for(int i=2;i<=n;i++){
            next=(f0+f1)%1000000007;
            f0=f1;
            f1=next;
        }
        return next;
    }

    public static void main(String[] args) {

        System.out.println(fib(0));
        System.out.println(fib(1));
        System.out.println(fib(2));
        System.out.println(fib(45));
        System.out.println(fib(48));
    }
}
