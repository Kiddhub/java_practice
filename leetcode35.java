//https://leetcode.com/problems/search-insert-position/
class leetcode35 {
    public int searchInsert(int[] nums, int target) {
        int m = nums.length;
        int index =0;
        for (int i=0;i<m;i++){
            if (nums[i]==target){
                index =i;
                break;
            }

            if (nums[i] > target){
                index =i;
                break;
            }
            if (target > nums[m-1]){
                index = m;
                break;
            }

        }
        return index;
    }
}