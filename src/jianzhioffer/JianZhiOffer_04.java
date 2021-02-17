package jianzhioffer;

public class JianZhiOffer_04 {
    public static void main(String[] args) {
        int[][] matrix= {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        int target=7;
        System.out.println(findNumberIn2DArray(matrix,target));
    }
    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        //空指针和空数组
        if(matrix==null||matrix.length<=0)
            return false;

        int m=matrix.length;
        int n=matrix[0].length;
        int i=0,j=n-1;
        while (i<m && j>=0){
            if(matrix[i][j]==target)
                return true;
            else if(matrix[i][j]>target){
                j=j-1;
            }else {
                i=i+1;
            }
        }
        return false;
    }
}
