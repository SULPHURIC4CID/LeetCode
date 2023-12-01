import java.util.*;

public class Question236
{
    public static void getPath(TreeNode root, TreeNode node, List<TreeNode> result,boolean[] flag)
    {
        result.add(root);
        if(root.val == node.val)
        {
            flag[0] = true;
            return;
        }
        else
        {
            //Move left
            if(root.left!=null && flag[0] == false)
            {
                getPath(root.left,node,result,flag);
                if(flag[0] == false)
                    result.remove(result.size()-1);
            }

            //Move right
            if(root.right!=null && flag[0] == false)
            {
                getPath(root.right,node,result,flag);
                if(flag[0] == false)
                    result.remove(result.size()-1);
            }
        }
    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) 
    {
        
        List<TreeNode> result1 = new ArrayList<>();
        List<TreeNode> result2 = new ArrayList<>();

        boolean[] flag = new boolean[1];
        flag[0] = false;

        getPath(root,p,result1,flag);
        flag[0] = false;
        getPath(root,q,result2,flag);

        System.out.println(result1);
        System.out.println(result2);

        TreeNode tn = null;
        if(result1.size()<result2.size())
        {
            for(TreeNode t:result1)
            {
                if(result2.contains(t))
                    tn = t;
            }            
        }
        else
        {
            for(TreeNode t:result2)
            {
                if(result1.contains(t))
                    tn = t;
            }
        }

        return tn;

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
        ll2.right = lastnew;

        Trees.display(root);

        TreeNode result = lowestCommonAncestor(root,rr2,lastnew);
        System.out.println("LCA : "+result.val);
    }
}
