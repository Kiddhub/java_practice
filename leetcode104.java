//https://leetcode.com/problems/maximum-depth-of-binary-tree/
class leetcode104 {
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        int result = Math.max(left,right)+1;
        return result;
    }
}