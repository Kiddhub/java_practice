//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
import java.util.*;
public class leetcode26 {
    public static int removeDuplicates(int[] nums) {
        int l=1;
        for (int i=1;i<nums.length;i++){
            if (nums[i] != nums[i-1]){
                nums[l] = nums[i];
                l++;
            }
        }
        return l;

    }
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,4};
        int n = nums.length;
        n = removeDuplicates(nums);
        for (int i = 0;i<n;i++)
        {
            System.out.print(nums[i]+ " ");
        }

    }

}