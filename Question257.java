import java.util.*;

public class Question257
{
    public static void getPath(TreeNode root,List<String> result,List<String> finalResult)
    {       
        String temp = result.get(0);
        String temp2 = result.get(0);
        temp = temp + root.val;

        System.out.println("-------------");
        System.out.println("Node value : "+ root.val);
        System.out.println("TEmp value : "+ temp);
        System.out.println("-------------");

        //If leaf node return
        if(root.left == null && root.right == null)
        {
            finalResult.add(temp);
            return;
        }

        if(root.left != null || root.right != null)
        {
            temp = temp + "->";
            result.clear();
            result.add(temp);
            //Move left
            if(root.left!=null)
            {
                getPath(root.left,result,finalResult);
            }

            //Move right
            if(root.right != null)
            {
                getPath(root.right,result,finalResult);
            }
            result.clear();
            result.add(temp2);
        }
        
    }

    public static List<String> binaryTreePaths(TreeNode root) 
    {
        List<String> result = new ArrayList<>();
        List<String> finalResult = new ArrayList<>();
        if(root==null)
            return result;
        result.add("");
        getPath(root,result,finalResult);        
        return finalResult;
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

        List<String> result = binaryTreePaths(root);
        System.out.println(result);
    }
}