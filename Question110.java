public class Question110
{

    public static int depth(TreeNode root)
    {
        if(root == null)
            return 0;
        if(root.left==null && root.right==null)
            return 1;
        int lDepth = depth(root.left);
        int rDepth = depth(root.right);
        if(lDepth>rDepth)
            return lDepth+1;
        else
            return rDepth+1;
    }

    public static boolean isBalanced(TreeNode root) 
    {
        if(root == null)
            return true;
        if(root.left == null && root.right == null)
            return true;
        
        int lDepth = depth(root.left);
        int rDepth = depth(root.right);
        if(Math.abs(lDepth-rDepth)>1)
            return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }

    public static void main(String[] args)
    {
        TreeNode root = new TreeNode(10,null,null);
        TreeNode l1 = new TreeNode(1,null,null);
        TreeNode r1 = new TreeNode(3,null,null);
        TreeNode ll2 = new TreeNode(-2,null,null);
        TreeNode rr2 = new TreeNode(20,null,null);
        TreeNode last = new TreeNode(33,null,null);
        root.left = l1;
        root.right = r1;
        l1.left = ll2;
        r1.right = rr2;
        rr2.right = last;
        boolean result = isBalanced(root);
        System.out.println("Result:"+result);
    }
}