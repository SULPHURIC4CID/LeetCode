import java.util.*;

public class Question1609
{
    public static void getLevelValues(TreeNode node, int level, List<List<Integer>> levelValues)
    {
        List<Integer> listOfInterest = levelValues.get(level);
        listOfInterest.add(node.val);
        if(node.left!=null)
        {
            getLevelValues(node.left,level+1,levelValues);
        }
        if(node.right!=null)
        {
            getLevelValues(node.right,level+1,levelValues);            
        }
    }

    public static int getDepth(TreeNode root)
    {
        if(root==null)
            return 0;
        if(root.left==null && root.right==null)
            return 1;
        
        int lDepth = getDepth(root.left);
        int rDepth = getDepth(root.right);

        if(lDepth>rDepth)
            return lDepth+1;
        else
            return rDepth+1;
    }

    public static boolean isEvenOddTree(TreeNode root) 
    {
        /*
        Pseudo Code-
        0. Get depth of the tree.
        1. Store each element in the level in a List<List<Integer>> collection.
        2. Iterate over the list elemetns and verify the even-odd tree conditions.
        3. Return true or false.
        */
        int treeDepth = getDepth(root);
        System.out.println("Depth : "+treeDepth);
        
        //Creating a levelValues List
        List<List<Integer>> levelValues = new ArrayList<>();
        for(int i = 0;i<treeDepth;i++)
        {
            List<Integer> temp = new ArrayList<>();
            levelValues.add(temp);
        }

        int level = 0;
        getLevelValues(root,0,levelValues);
        System.out.println(levelValues);
        for(int i = 0;i<levelValues.size();i++)
        {
            List<Integer> row = levelValues.get(i);
            if(i%2==0) //even levels
            {
                int ini = row.get(0);
                if(ini%2==0)
                    return false;
                for(int j = 1;j<row.size();j++)
                {
                    int curr = row.get(j);
                    if(curr%2==0)
                        return false;
                    if(curr<=ini)
                        return false;
                    ini = curr;
                }
            }
            else //odd levels
            {
                int ini = row.get(0);
                if(ini%2==1)
                    return false;
                for(int j = 1;j<row.size();j++)
                {
                    int curr = row.get(j);
                    if(curr%2==1)
                        return false;
                    if(curr>=ini)
                        return false;
                    ini = curr;
                }
            }
        }
        return true;

    }

    public static void main(String[] args)
    {
        TreeNode root = new TreeNode(11,null,null);
        TreeNode l1 = new TreeNode(8,null,null);
        TreeNode r1 = new TreeNode(2,null,null);
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
        boolean result = isEvenOddTree(root);
        System.out.println("REsult:"+result);
    }
}