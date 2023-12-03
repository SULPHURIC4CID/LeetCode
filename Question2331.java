public class Question2331 
{
    public static boolean evaluateTree(TreeNode root) 
    {
        if(root.val==0)
            return false;
        else if(root.val==1)
            return true;
        else if(root.val==2)
            return evaluateTree(root.left) || evaluateTree(root.right);
        else
            return evaluateTree(root.left) && evaluateTree(root.right);
    }

    public static void main(String[] args) 
    {
        TreeNode n1 = new TreeNode(3,null,null);
        TreeNode n2 = new TreeNode(3,null,null);
        TreeNode n3 = new TreeNode(3,null,null);
        TreeNode n4 = new TreeNode(0,null,null);
        TreeNode n5 = new TreeNode(1,null,null);
        TreeNode n6 = new TreeNode(1,null,null);
        TreeNode n7 = new TreeNode(1,null,null);
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;

        Trees.display(n1);
        boolean result = evaluateTree(n1);
        System.out.println(result);
    }
}
