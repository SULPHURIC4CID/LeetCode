import java.util.*;

public class Question199
{
    public static void getVal(TreeNode root, List<List<Integer>> result,int level)
    {
        List<Integer> temp = result.get(level);
        temp.add(root.val);
        if(root.left!=null)
        {
            getVal(root.left,result,level+1);
        }
        if(root.right!=null)
        {
            getVal(root.right,result,level+1);
        }        
    }

    public static int depth(TreeNode root)
    {
        if(root==null)
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

    public static List<Integer> rightSideView(TreeNode root) 
    {
        /*
        Pseudo Code-
        1. get level values, and extarct right most values from each level
        */
        List<Integer> rightList = new ArrayList<>();
        
        List<List<Integer>> result = new ArrayList<>();
        if(root==null)
            return rightList;

        for(int i = 0;i<depth(root);i++)
        {
            List<Integer> temp = new ArrayList<>();
            result.add(temp);
        }
        
        getVal(root,result,0);
        //Get rightmost elements of the level list
        for(int i =0;i<result.size();i++)
        {
            List<Integer> temp = result.get(i);
            rightList.add(temp.get(temp.size()-1));
        }

        return rightList;
    }

    public static void main(String[] args)
    {
        TreeNode root = new TreeNode(146,null,null);
        TreeNode l1 = new TreeNode(71,null,null);
        TreeNode r1 = new TreeNode(-13,null,null);
        TreeNode ll2 = new TreeNode(55,null,null);
        TreeNode rr2 = new TreeNode(231,null,null);
        TreeNode last = new TreeNode(399,null,null);
        TreeNode lastnew = new TreeNode(321,null,null);
        TreeNode lastnew2 = new TreeNode(-33,null,null);
        root.left = l1;
        root.right = r1;
        l1.left = ll2;
        l1.right = last;
        r1.left = rr2;

        Trees.display(root);
        List<Integer> result = rightSideView(root);
        System.out.println("Right List:"+result);
    }
}