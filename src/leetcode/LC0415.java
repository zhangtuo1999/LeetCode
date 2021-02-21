package leetcode;

public class LC0415 {
    public static void main(String[] args) {
        System.out.println(addStrings("1234", "11"));
    }

    public static String addStrings(String num1, String num2) {
        int i = num1.length() - 1, j = num2.length() - 1, flag = 0;
        StringBuffer sb = new StringBuffer();
        while (i >= 0 || j >= 0 || flag != 0) {
            int x = i < 0 ? 0 : num1.charAt(i) - '0';
            int y = j < 0 ? 0 : num2.charAt(j) - '0';
            int res = x + y + flag;
            sb.append(res % 10);
            flag = res / 10;
            i--;
            j--;
        }
        return sb.reverse().toString();
    }
}
