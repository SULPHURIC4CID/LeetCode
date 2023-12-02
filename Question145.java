public class Question144 
{
    public static void getVal(TreeNode node, List<Integer> result)
    {
       
        if(node.left!=null)
        {
            getVal(node.left,result);
        }
        if(node.right!=null)
        {
            getVal(node.right,result);
        }
        result.add(node.val);
    }

    public static List<Integer> postorderTraversal(TreeNode root) 
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
