package jianzhioffer;

public class JianZhiOffer_15 {
    public static void main(String[] args) {
        System.out.println(hammingWeight(0b11111111111111111111111111111101));
    }
    public static int hammingWeight(int n) {
        int count=0;
        while (n!=0){
            count++;
            n=(n-1)&n;
        }
        return count;
    }
}
