//https://leetcode.com/problems/reverse-integer/
class leetcode7 {
    public int reverse(int x) {
        int index = 0;
        int result = 0;

        while (x!=0){
            index = x % 10;
            x = x/10;
            if (result > Integer.MAX_VALUE/10)
                return 0;
            if (result < Integer.MIN_VALUE/10)
                return 0;
            result = result*10 + index;

        }
        return result;

    }
}


