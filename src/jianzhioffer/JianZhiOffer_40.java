package jianzhioffer;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class JianZhiOffer_40 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getLeastNumbers(new int[]{3, 2, 1}, 2)));
    }
    public static int[] getLeastNumbers(int[] arr, int k) {
        if(arr==null||arr.length==0)
            return arr;
        if(k==0)
            return new int[0];
        Queue<Integer> pq=new PriorityQueue<>((v1, v2) -> v2 - v1);
        for(int i=0;i<arr.length;i++){
            if(pq.size()<k){
                pq.add(arr[i]);
            }else if(arr[i]<pq.peek()){
                pq.poll();
                pq.add(arr[i]);
            }
        }
        int[] res=new int[k];
        for(int i=0;i<k;i++){
            res[i]=pq.poll();
        }
        return res;
    }
}
