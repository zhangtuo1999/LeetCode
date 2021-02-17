package jianzhioffer;

public class JianZhiOffer_11 {
    public static void main(String[] args) {
        int[] arr={3,4,5,1,2};
        int[] arr1={2,2,2,0,1};
        int[] arr2={1,2,3,4,5};
        System.out.println(minArray(arr2));
    }
    public static int minArray(int[] numbers) {
        int start=0;
        int end=numbers.length-1;
        int mid=start;

        if(numbers[start]<numbers[end])
            return numbers[start];
        while (start<=end){
            if((end-start)==1)
                return numbers[end];
            mid=(start+end)/2;
            if(numbers[mid]==numbers[start]&&numbers[mid]==numbers[end])
                return minSpecial(numbers);
            if(numbers[mid]>=numbers[start])
                start=mid;
            if(numbers[mid]<numbers[start])
                end=mid;
        }
        return end;
    }

    private static int minSpecial(int[] numbers) {
        for(int i=0;i<numbers.length-1;i++){
            if(numbers[i]>numbers[i+1])
                return numbers[i+1];
        }
        return numbers[0];
    }
}
