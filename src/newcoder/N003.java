package newcoder;

public class N003 {
    public static void main(String[] args) {
        System.out.println(combination(11,22));
    }
    public static int combination (int r, int n) {
        // write code here
        r= Math.min(r, (n - r));
        long res=1;
        for(int i=n;i>=(n-r+1);i--)
            res*=i;
        for(int i=1;i<=r;i++)
            res/=i;
        return (int)res;
    }
}
