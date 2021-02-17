package newcoder;

import java.util.Arrays;

public class N001 {
    public static void main(String[] args) {
        System.out.println(reorder(new int[]{1,2,2,2,2,3}));
    }
    public static int reorder (int[] prices) {
        // write code here
        int[] arr=new int[prices.length];
        int mid=(prices.length)/2;
        int num=0, num1=0;
        Arrays.sort(prices);

        int k=0;
        for(int i=prices.length-1;i>=mid;i--){
            arr[k]=prices[i];
            k+=2;
        }
        k=1;
        for(int i=mid-1;i>=0&&k< arr.length;i--){
            arr[k]=prices[i];
            k+=2;
        }
        for(int i:arr)
            System.out.println(i);
        System.out.println();
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]<arr[i-1]&&arr[i]<arr[i+1])
                num++;
        }

        if(prices.length%2==0){
            k=1;
            for(int i=prices.length-1;i>=mid;i--){
                arr[k]=prices[i];
                k+=2;
            }
            k=0;
            for(int i=mid-1;i>=0&&k< arr.length;i--){
                arr[k]=prices[i];
                k+=2;
            }

            for(int i=1;i<arr.length-1;i++){
                if(arr[i]<arr[i-1]&&arr[i]<arr[i+1])
                    num1++;
            }
        }
        num=Math.max(num,num1);
        return num;
    }
}
