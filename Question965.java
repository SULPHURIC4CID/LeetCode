public class Question965
{
    public static boolean check(TreeNode node,int val)
    {
        if(node.val!=val)
            return false;
        else
        {
            boolean left = true;
            boolean right = true;
            if(node.left!=null)
                left = check(node.left,val);
            if(node.right!=null)
                right = check(node.right,val);
            return left && right;
        }
    }
    public static boolean isUnivalTree(TreeNode root) 
    {
        int val = root.val;
        return check(root,val);
    }

    public static void main(String[] args)
    {

    }
}