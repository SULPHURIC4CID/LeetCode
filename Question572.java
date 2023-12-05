import java.util.*;

public class Question572
{
    public static boolean check(TreeNode root,String subRootString)
    {
        String rootString = serialize(root);
        if(rootString.equals(subRootString))
        {            
            return true;            
        }
        else
        {
            boolean left = false;
            boolean right = false;
            //check left and right
            if(root.left !=null)
                left = check(root.left,subRootString);
            if(root.right!=null)
                right = check(root.right,subRootString);
            return left || right;
        }
    }

    //in order travesal
    public static String serialize(TreeNode node)
    {
        List<Integer> result = new ArrayList<>();
        StringBuilder temp = new StringBuilder();
        if(node==null)
            return "";
        getVal(node,result);
        System.out.println("List:"+result);
        for(int val:result)
        {
            temp.append(val);
            temp.append(',');    
        }
        return temp.toString();
    }

    public static void getVal(TreeNode root, List<Integer> result)
    {
        if(root.left!=null)
            getVal(root.left,result);
        result.add(root.val);
        if(root.right!=null)
            getVal(root.right,result);
    }


    public static boolean isSubtree(TreeNode root, TreeNode subRoot) 
    {
        String subRootString = serialize(subRoot);
        return check(root,subRootString);  
    }

    public static void main(String[] args)
    {
        TreeNode root = new TreeNode(4,null,null);
        TreeNode n1 = new TreeNode(4,null,null);
        TreeNode n2 = new TreeNode(5,null,null);
        TreeNode n3 = new TreeNode(1,null,null);
        TreeNode n4 = new TreeNode(2,null,null);
        TreeNode n5 = new TreeNode(0,null,null);
        root.left = n1;
        root.right= n2;
        n1.left = n3;
        n1.right = n4;
        //n4.left = n5;


        TreeNode subRoot = new TreeNode(4,null,null);
        TreeNode l1 = new TreeNode(1,null,null);
        TreeNode r1 = new TreeNode(2,null,null);
        subRoot.left = l1;
        subRoot.right=r1;

        Trees.display(root);
        Trees.display(subRoot);

        boolean result = isSubtree(root,subRoot);
        System.out.println(result);
    }
}


