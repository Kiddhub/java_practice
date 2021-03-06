// https://leetcode.com/problems/longest-common-prefix/
public class leetcode14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        String prefix = strs[0];
        for (int i = 0;i<strs.length;i++){
            while (strs[i].indexOf(prefix) !=0){
                prefix =prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }
    public static void main(String[] args){
        String[] a = {"flower","flow","flight"};
        leetcode14 result = new leetcode14();
        System.out.println(result.longestCommonPrefix(a));
    }

}

