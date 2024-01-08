public class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        int[] res = new int[1];
        dfs(root, low, high, res);
        return res[0];


    }
    private void dfs(TreeNode root, int low, int high, int[] res){
        if(root == null){
            return;
        }
        dfs(root.left, low, high, res);

        if(root.val > high){
            return;
        }
        res[0] += root.val >= low ? root.val : 0;
        dfs(root.right, low, high, res);

    }
}

