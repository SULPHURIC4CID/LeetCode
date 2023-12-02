public class Question98 
{
    public static int getMax(TreeNode node)
    {
        int max = node.val;
        if(node.left!=null)
        {
            int val = getMax(node.left);            
            if(val>max)
                max = val;
        }
        if(node.right!=null)
        {
            int val = getMax(node.right);
            if(val>max)
                max = val;
        }        
        return max;
    }

    public static int getMin(TreeNode node)
    {
        int min = node.val;
        if(node.left!=null)
        {
            int val = getMin(node.left);            
            if(val<min)
                min = val;
        }
        if(node.right!=null)
        {
            int val = getMin(node.right);
            if(val<min)
                min = val;
        }        
        return min;
    }

    public static boolean isValidBST(TreeNode root) 
    {
        if(root.left==null && root.right==null)
            return true;
        if(root.left!=null)
        {
            int max = getMax(root.left);
            if(max>=root.val)
                return false;
            if(isValidBST(root.left)==false)
                return false;
        }
        if(root.right!=null)
        {
            int min = getMin(root.right);
            if(min<=root.val)
                return false;
            if(isValidBST(root.right)==false)
                return false;
        }
        return true;
    }

    public static void main(String[] args) 
    {
        TreeNode root = new TreeNode(11,null,null);
        TreeNode l1 = new TreeNode(8,null,null);
        TreeNode r1 = new TreeNode(20,null,null);
        TreeNode ll2 = new TreeNode(-3,null,null);
        TreeNode rr2 = new TreeNode(21,null,null);
        TreeNode last = new TreeNode(32,null,null);
        TreeNode lastnew = new TreeNode(123,null,null);
        root.left = l1;
        root.right = r1;
        l1.left = ll2;
        r1.right = rr2;
        rr2.right = last;
        last.right = lastnew;

        Trees.display(root);
        boolean result = isValidBST(root);
        System.out.println("REsult:"+result);
    }
}
