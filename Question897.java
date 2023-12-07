import java.util.*;

public class Question897
{
    public static void getVal(TreeNode root,List<Integer> result)
    {
        if(root.left!=null)
            getVal(root.left,result);
        result.add(root.val);
        if(root.right!=null)
            getVal(root.right,result);
    }

    public static List<Integer> getElements(TreeNode root)
    {
        List<Integer> result = new ArrayList<>();
        if(root==null)
            return result;
        getVal(root,result);
        return result;
    }
    public static TreeNode increasingBST(TreeNode root) 
    {
        List<Integer> vals = getElements(root);
        int index = 1;
        TreeNode root1 = null;
        TreeNode head = null;
        for(int val:vals)
        {
            if(index==1)
            {
                root1 = new TreeNode(val,null,null);
                head = root1;
            }
            else
            {
                TreeNode temp = new TreeNode(val,null,null);
                root1.right = temp;
                //Trees.display(root1);
                root1 = temp;
            }    
            index++;
        }
        //Trees.display(head);
        return head;
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

        root = increasingBST(root);
        Trees.display(root);
    }
}