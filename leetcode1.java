//https://leetcode.com/problems/two-sum/
public class leetcode1 {
    public class Main {
        public static void main(String[] args){
            int[] nums ={2,7,11,15};
            int target = 9;
            int[] result = twoSum(nums,target);
            System.out.println(result[0] + "," + result[1]);
        }
        private static int[] twoSum(int[] nums, int target) {
            int a[] = new int[2];
            for (int i = 0;i<nums.length;i++){
                for (int j = i+1;j<nums.length;j++){
                    if (nums[i]+nums[j]== target){
                        a[0] = i;
                        a[1] =j;
                        return a;
                    }
                }
            }
            return a;
        }
    }
}
