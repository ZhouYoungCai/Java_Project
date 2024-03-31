package leetcode;

/**
 * 输入一个整数，反转输出
 */
public class ReverseInteger {

    public static int reverse(int x) {
        String str = String.valueOf(x);
        String result = "0";
        int k = 0;
        if(str.startsWith("-")){
            result = "-";
            k = 1;
        }
        for(int i=str.length()-1;i>=k;i--){
            result +=String.valueOf(str.charAt(i));
        }
        try{
            return Integer.parseInt(result);
        }catch(Exception e){
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(reverse(120));
        System.out.println(reverse(-123));
    }

}

