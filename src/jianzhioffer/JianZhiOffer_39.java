package jianzhioffer;

public class JianZhiOffer_39 {
    public static void main(String[] args) {

    }
    public static int majorityElement(int[] nums) {
        int x=0,count=0;
        for(int num:nums){
            if(count==0) x=num;
            count+=num==x?1:-1;
        }
        return x;
    }
}
