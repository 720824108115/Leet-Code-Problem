/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
        private boolean isValid(TreeNode node,long min,long max)
        {
            if(node == null) return true;
            if(node.val <= min || node.val >= max)
            {
                return false;
            }
            return isValid(node.left, min, node.val) &&
                     isValid(node.right, node.val, max);
        }
        public static void main(String[] args)
        {
          Solution  solution = new Solution();
            TreeNode root1 = new TreeNode(2);
            root1.left = new TreeNode(1);
            root1.right = new TreeNode(3);
            System.out.println(solution.isValidBST(root1));
            TreeNode root2 = new TreeNode(5);
            root2.left = new TreeNode(1);
            root2.right = new TreeNode(4);
            root2.right.left = new TreeNode(3);
            root2.right.left = new TreeNode(6);
            System.out.println(solution.isValidBST(root2));
        }
    
}