public class leetcode9{
    public static void main(String[] args){
        int x = 121;
        System.out.println(isPalindrome(x));
    }
    public static boolean isPalindrome(int x) {
        if (x<0){
            return false;
        }
        else if (x==0){
            return true;
        }
        else if (x>0){
            int n = x;
            int res = 0;
            int tmp;
            while(n>0){
                tmp = n % 10;
                res = res*10 + tmp;
                n = n/10;
            }
            if (res == x)
            {
                return true;
            }
            else {
                return false;
            }
        }
        return false;

    }
}