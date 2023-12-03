import java.util.*;

public class Question102
{
    public static void getVal(List<List<Integer>> result,int level, TreeNode root)
    {
        List<Integer> temp = result.get(level);
        temp.add(root.val);
        if(root.left!=null)
            getVal(result,level+1,root.left);
        if(root.right!=null)
            getVal(result,level+1,root.right);

    }
    public static List<List<Integer>> levelOrder(TreeNode root) 
    {
        List<List<Integer>> result = new ArrayList<>();

        if(root == null)
            return result;      

        //Find depth
        int treeDepth = depth(root);

        for(int i = 0;i<treeDepth;i++)
        {
            List<Integer> temp = new ArrayList<>();
            result.add(temp);
        }

        getVal(result,0,root);
        return result;
    }

    public static int depth(TreeNode root)
    {
        if (root == null)
            return 0;
        
        int lDepth = depth(root.left);
        int rDepth = depth(root.right);

        if(lDepth>rDepth)
            return lDepth + 1;
        else
            return rDepth + 1;
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
        Trees.display(root);
        List<List<Integer>> result = levelOrder(root);
        System.out.println(result);
    }
}