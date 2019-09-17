package SymmetricTree101;

public class SymmetricTree {
	/**
	 * Definition for a binary tree node.
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode(int x) { val = x; }
	 * }
	 */
	    public boolean isSymmetric(TreeNode root) {
	        boolean isTrue = isMirror(root, root);
	        return isTrue;
	    }
	    
	    public boolean isMirror(TreeNode q, TreeNode p){
	        if(q == null && p == null){
	            return true;
	        }
	        
	        if(q == null || p == null){
	            return false;
	        }
	        
	        if(p.val != q.val){
	            return false;
	        }
	        
	        return (q.val == p.val) && isMirror(q.right, p.left) && isMirror(q.left, p.right);
	  }
}