package jianzhioffer;

public class JianZhiOffer_05 {
    public static void main(String[] args) {
        String s="We are happy.";
        System.out.println(replaceSpace(s));
    }
    public static String replaceSpace(String s) {
        //return s.replace(" ","%20");

        //空指针和空串
        if(s==null)
            return null;
        if(s.length()==0)
            return "";

        char[] chs=s.toCharArray();
        int count=0;
        for(char ch:chs)
            if(ch==' ')
                count++;
        //无空格
        if(count==0)
            return s;

        char[] arr=new char[chs.length+count*2];
        int i=chs.length-1;
        int j=arr.length-1;
        while (i>=0) {
            if (chs[i] == ' ') {
                arr[j--] = '0';
                arr[j--] = '2';
                arr[j--] = '%';
            } else {
                arr[j--] = chs[i];
            }
            i--;
        }
        return new String(arr);
    }
}
