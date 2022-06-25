//https://leetcode.com/problems/plus-one/
class leetcode66 {
    public int[] plusOne(int[] digits) {
        int result[];
        int sum = 0;
        int carry = 1;
        for (int i=digits.length-1;i>=0;i--){
            sum = digits[i] + carry;
            digits[i] = sum%10;
            carry = sum/10;
        }
        if (carry > 0){
            result= new int[digits.length +1];
            result[0] = carry;
            for (int i =1;i<result.length;i++){
                result[i] = digits[i-1];
            }
        }
        else
            return digits;

        return result;


    }
}