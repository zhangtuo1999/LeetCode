package newcoder;

public class N004 {
    public static void main(String[] args) {
        int[] arr=arrayMerge(new int[]{1,2,3},3,new int[]{6},1);
        for(int i:arr){
            System.out.println(i);
        }
    }
    public static int[] arrayMerge (int[] array1, int n, int[] array2, int m) {
        // write code here
        int[] res=new int[n+m];
        int i=0,j=m-1,k=0;    //双指针
        while(i<n&&j>=0){
            if(array1[i]<array2[j]) res[k++]=array1[i++];
            else if(array1[i]>array2[j]) res[k++]=array2[j--];
            else { res[k++]=array1[i++];res[k++]=array2[j--]; }
        }
        while (i<n) res[k++]=array1[i++];
        while (j>=0) res[k++]=array2[j--];
        return res;
    }
}
