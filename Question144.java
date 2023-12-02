public class Question144 
{
    public static void getVal(TreeNode node, List<Integer> result)
    {
        result.add(node.val);
        if(node.left!=null)
        {
            getVal(node.left,result);
        }
        if(node.right!=null)
        {
            getVal(node.right,result);
        }
    }

    public static List<Integer> preorderTraversal(TreeNode root) 
    {
        //preorder -> root,left,right
        if(root==null)
            return new ArrayList<Integer>();
        List<Integer> result = new ArrayList<>();
        getVal(root,result);        
        return result;
    }

    public static void main(String[] args) 
    {
        
    }
}
