/**
 * Created by xianggao on 16/1/23.
 * 226
 *
 * 左右互换
 */
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return null;
        }
        TreeNode left=root.left;
        TreeNode right=root.right;

        root.right=invertTree(left);
        root.left=invertTree(right);


        return root;
    }
}
