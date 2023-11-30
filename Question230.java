import java.util.*;
public class Question230
{
    public static void inorder(List<Integer> result,TreeNode root, int k)
    {
        if(result.size()<k)
        {
            if(root.left!=null)
                inorder(result,root.left,k);
            result.add(root.val);
            if(root.right!=null)
                inorder(result,root.right,k);
        }
    }

    public static int kthSmallest(TreeNode root, int k)
    {
        List<Integer> result = new ArrayList<>();
        inorder(result,root,k);
        System.out.println(result);
        return result.get(k-1);
    }

    public static void main(String[] args)
    {
        TreeNode root = new TreeNode(10,null,null);
        TreeNode l1 = new TreeNode(1,null,null);
        TreeNode r1 = new TreeNode(3,null,null);
        TreeNode ll2 = new TreeNode(-2,null,null);
        TreeNode rr2 = new TreeNode(20,null,null);
        TreeNode last = new TreeNode(33,null,null);
        TreeNode lastnew = new TreeNode(123,null,null);
        root.left = l1;
        root.right = r1;
        l1.left = ll2;
        r1.right = rr2;
        rr2.right = last;
        last.left = lastnew;

        Trees.display(root);
        kthSmallest(root,5);
    }
}