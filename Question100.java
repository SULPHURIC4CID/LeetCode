public class Question100
{    
    public static boolean isSameTree(TreeNode p, TreeNode q) 
    {
        if(p==null && q==null)
        {
            
        return true;
        }
        if(p==null || q==null)
        {
            
        return false;
        }
        if(p.val!=q.val)
        {
          
        return false;
        }
        if(isSameTree(p.left,q.left)&& isSameTree(p.right,q.right))
        {
           
        return true;
        }
        return false;     
    }

    public static void main(String[] args)
    {

    }
}