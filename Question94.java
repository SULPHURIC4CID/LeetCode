import java.util.*;

public class Question94
{
    public static void add(List<Integer> result,TreeNode root)
    {        
        if(root.left!=null)
        {
            add(result,root.left);
        }
        result.add(root.val);
        if(root.right != null)
        {
            add(result,root.right);
        }
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null)
            return result;
        add(result,root);
        return result;
    }

    public static void main(String[] args)
    {
       TreeNode root = new TreeNode(2,null,null);
       TreeNode left = new TreeNode(4,null,null);
       TreeNode right = new TreeNode(16,null,null);
       TreeNode left2 = new TreeNode(11,null,null);
       TreeNode right2 = new TreeNode(2333,null,null);
       root.left = left;
       root.right = right;
       right.left = left2;
       right.right = right2;
       List<Integer> result = inorderTraversal(null);
       System.out.println(result);
    }
}