package newcoder;

import java.util.Scanner;
import java.util.Stack;

public class Bili001 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<String> s=new Stack<>();
        while (!sc.hasNext("/n")){
            String input=sc.next();
            s.push(input);
        }
        while (s.size()>1){
            System.out.print(s.pop()+' ');
        }
    }
}
