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
    private static int count=0;
    public int kthSmallest(TreeNode root, int k) {
        count=0;
        // System.out.println(count+" "+k);

        TreeNode node = preorder(root,k);
        if(count== k)
            return node.val;
        return -1;
    }
    public static TreeNode preorder(TreeNode node,int k){
        if(node == null)
            return null;
        TreeNode left = preorder(node.left,k);
        if(left!= null){
            return left;
        }
        // System.out.println(node.val+" "+count+" "+k);
        count+=1;
        System.out.println(node.val+" "+count+" "+k);
        if(k==count)
            return node;
        
        return preorder(node.right,k);
        

    }
}