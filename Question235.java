import java.util.*;

public class Question236
{
    public static void getPath (TreeNode root, List<TreeNode> result, TreeNode node)
    {
        if(root!=null)
        {           
            result.add(root);
            if(root.val == node.val)
                return;
            else if(root.val>node.val)
                getPath(root.left,result,node);
            else
                getPath(root.right,result,node);
        }
    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) 
    {        
        List<TreeNode> node1List = new ArrayList<>();
        List<TreeNode> node2List = new ArrayList<>();
        getPath(root,node1List,p);
        getPath(root,node2List,q);

        System.out.println(node1List);
        System.out.println(node2List);


        TreeNode result = null;
        int minValue = Integer.MAX_VALUE;
        if(node1List.size()<node2List.size())
        {
            for(TreeNode tn:node1List)
            {
                if(node2List.contains(tn))
                {
                    result = tn;
                }
            }
        }
        else
        {
            for(TreeNode tn1:node2List)
            {
                if(node1List.contains(tn1))
                {
                    result = tn1;
                }
            }
        }
        return result;
    }

    public static void main(String[] args)
    {
        TreeNode root = new TreeNode(10,null,null);
        TreeNode l1 = new TreeNode(7,null,null);
        TreeNode r1 = new TreeNode(12,null,null);
        TreeNode ll2 = new TreeNode(-3,null,null);
        TreeNode rr2 = new TreeNode(20,null,null);
        TreeNode last = new TreeNode(33,null,null);
        TreeNode lastnew = new TreeNode(123,null,null);
        root.left = l1;
        root.right = r1;
        l1.left = ll2;
        r1.right = rr2;
        rr2.right = last;
        last.right = lastnew;

        Trees.display(root);

        TreeNode result = lowestCommonAncestor(root,l1,r1);
        System.out.println("LCA : "+result.val);
    }
}