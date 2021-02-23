package newcoder;

import java.util.HashSet;

public class NC63 {
    public static void main(String[] args) {
        System.out.println(IsContinuous(new int[]{1,2,3,4,5}));
        System.out.println(IsContinuous(new int[]{0,2,0,4,5}));
        System.out.println(IsContinuous(new int[]{1,2,2,4,5}));
        System.out.println(IsContinuous(new int[]{1,9,3,4,5}));
    }
    public static boolean IsContinuous(int [] numbers) {
        if(numbers.length<5)
            return false;
        int max=0,min=13;
        HashSet<Integer> set=new HashSet<>();
        for(int num:numbers){
            if(num==0)
                continue;
            if(set.contains(num)){
                return false;
            }else {
                max=Math.max(num,max);
                min=Math.min(num,min);
                set.add(num);
            }
        }
        if((max-min)<5)
            return true;
        return false;
    }

}
