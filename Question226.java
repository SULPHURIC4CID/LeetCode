public class Question226
{
    public static TreeNode invertTree(TreeNode root) 
    {
        /*
        Pseudo Code
        1. Swap .left with .right
        2. Invert .left and .right
        3. return root
        */
        if(root == null)
            return root;
        if(root.left != null || root.right!=null)
        {
            TreeNode temp = root.left;
            root.left = invertTree(root.right);
            root.right = invertTree(temp);
        }
        return root;
    }

    public static void main(String[] args)
    {
        TreeNode root = new TreeNode(10,null,null);
        TreeNode l1 = new TreeNode(1,null,null);
        TreeNode r1 = new TreeNode(3,null,null);
        TreeNode ll2 = new TreeNode(-2,null,null);
        TreeNode rr2 = new TreeNode(20,null,null);
        TreeNode last = new TreeNode(33,null,null);
        TreeNode lastnew = new TreeNode(123,null,null);
        root.left = l1;
        root.right = r1;
        l1.left = ll2;
        r1.right = rr2;
        rr2.right = last;
        last.left = lastnew;

        Trees.display(root);

        TreeNode result = invertTree(root);
        Trees.display(result);
    }
}