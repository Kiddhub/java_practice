// https://leetcode.com/problems/valid-parentheses/
import java.util.*;
public class leetcode20 {
    public static boolean isValid(String s) {
        char arr[] = s.toCharArray();
        Stack<Character> set=new Stack();
        for (Character ch: arr){
            if (ch == '(' || ch == '[' || ch == '{'){
                set.push(ch);
            }
            else if (ch == ')') {
                if (set.isEmpty() || set.peek() != '(' ){
                    return false;
                }
                set.pop();
            }
            else if (ch == ']') {
                if (set.isEmpty() || set.peek() != '[' ){
                    return false;
                }
                set.pop();
        }
            else if (ch == '}') {
                if (set.isEmpty() || set.peek() != '{' ){
                    return false;
                }
                set.pop();
            }
            
    }
        return set.size ()==0;
}
    public static void main(String[] args){
        String s ="()[]{}";
        if (isValid(s))
            System.out.println("True");
        else 
            System.out.println("False");
}
}