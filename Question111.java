public class Question111
{
    public static void check(int curr,TreeNode node,int[] result)
    {
        if(node.left == null && node.right == null && curr<result[0]) // if leaf node
        {
            curr++;
            if(curr<result[0])
                result[0] = curr;
        }
        else
        {
            if(node.left!=null)
            {
                check(curr+1,node.left,result);
            }
            if(node.right!=null)
            {
                check(curr+1,node.right,result);
            }
        }        
    }

    public static int minDepth(TreeNode root) 
    {
        int[] result = new int[1];
        result[0] = Integer.MAX_VALUE;
        if(root==null)
            return 0;
        check(0,root,result);
        return result[0];
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
        int result = minDepth(root);
        System.out.println("Min Depth: "+result);
    }
}