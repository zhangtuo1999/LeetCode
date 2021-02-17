package leetcode;

public class LC0004 {
    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1,2},new int[]{1,2}));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0,j=0,k=0;
        int l1=nums1.length;
        int l2=nums2.length;
        int[] res=new int[l1+l2];
        while(i<l1&&j<l2){
            if(nums1[i]<nums2[j])
                res[k++]=nums1[i++];
            else if(nums1[i]>nums2[j])
                res[k++]=nums2[j++];
            else{
                res[k++]=nums1[i++];
                res[k++]=nums2[j++];
            }
        }
        while (i<l1){
            res[k++]=nums1[i++];
        }
        while (j<l2){
            res[k++]=nums2[j++];
        }
        if(res.length%2==0)
            return (double) (res[res.length/2]+res[res.length/2-1])/2;
        else return res[res.length/2];
    }
}
