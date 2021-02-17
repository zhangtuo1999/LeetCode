package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class LC5654 {
    public static void main(String[] args) {
        System.out.println(countBalls(1,10));
        System.out.println(countBalls(5,15));
        System.out.println(countBalls(19,28));

    }
    public static int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer, Integer> box = new HashMap();
        for (int i = lowLimit; i <= highLimit; i++) {
            int box_num = getBoxNum(i);
            if (box.get(box_num) == null) {
                box.put(box_num, 1);
            } else {
                box.put(box_num, box.get(box_num) + 1);
            }
        }
        int max = 0;
        Iterator<Map.Entry<Integer, Integer>> it = box.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, Integer> entry = it.next();
            max = max > entry.getValue() ? max : entry.getValue();
        }
        return max;

    }
    private static int getBoxNum ( int i){
        int box_num = 0;
        while (i != 0) {
            box_num += (i % 10);
            i /= 10;
        }
        return box_num;
    }
}
