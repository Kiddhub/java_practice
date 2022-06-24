//https://leetcode.com/problems/length-of-last-word/
class leetcode58 {
    public int lengthOfLastWord(String s) {
        int res =0;
        int i = s.length() -1;
        while (i >= 0){
            if (res> 0 && s.charAt(i) == ' '){
                break;
            }
            else if (s.charAt(i) != ' '){
                res ++;
            }
            i--;
        }
        return res;


    }
}