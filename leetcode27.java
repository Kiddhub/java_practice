//https://leetcode.com/problems/remove-element/
import java.util.*;
public class leetcode27 {
    public static int removeElement(int[] nums, int val) {
        int l=0;
        for (int i =0;i<nums.length;i++){
            if(nums[i] != val){
                nums[l] = nums[i];
                l++;
            }

        }
        return l;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;
        int result = removeElement(nums, val);
        System.out.println(result);

    }
}