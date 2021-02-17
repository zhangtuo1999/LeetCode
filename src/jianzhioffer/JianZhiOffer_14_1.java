package jianzhioffer;

public class JianZhiOffer_14_1 {
    public static void main(String[] args) {
        System.out.println(cuttingRope(2));
        System.out.println(cuttingRope(3));
        System.out.println(cuttingRope(4));
        System.out.println(cuttingRope(5));
        System.out.println(cuttingRope(6));
        System.out.println(cuttingRope(7));
        System.out.println(cuttingRope(10));
    }

    public static int cuttingRope(int n) {
        if(n<2) return 0;
        if(n==2) return 1;
        if(n==3) return 2;

        int[] arr=new int[n+1];
        arr[0]=0;
        arr[1]=1;
        arr[2]=2;
        arr[3]=3;
        for(int i=4;i<=n;i++){
            int max=0;
            for(int j=1;j<=i/2;j++){
               max= Math.max(max, (arr[j] * arr[i - j]));
               arr[i]=max;
            }
        }
        return arr[n];
    }
}
