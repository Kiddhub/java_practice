//https://leetcode.com/problems/longest-substring-without-repeating-characters/
class leetcode3 {
    public int lengthOfLongestSubstring(String s) {
        if (s.equals("")) return 0;
        List<Character> list = new ArrayList<>();
        int res = 1;
        for (int i = 0; i < s.length(); i++) {
            if (!list.contains(s.charAt(i))) {
                list.add(s.charAt(i));
            } else {
                res = Math.max(list.size(), res);
                int index = list.indexOf(s.charAt(i)) + 1;
                list = list.subList(index, list.size());
                i = i == s.length() - 1? i : i - 1;
            }
        }
        return Math.max(res, list.size());
    }
}