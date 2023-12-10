import java.util.*;

public class Question993
{
    public static void getDetails(TreeNode root, int x, int[] details, boolean[] status)
    {
        //System.out.println("Insiude : "+Arrays.toString(details));
        if(root.val==x)
        {            
            status[0]=true;
            return;
        }
        else
        {
            details[0] = root.val;
            details[1] += 1;     
            int t1 = details[0];
            int t2 = details[1];
            //Check left
            if(root.left != null && status[0]==false)
            {                          
                getDetails(root.left,x,details,status);
            }
            //Check Right
            if(root.right!=null && status[0] == false)
            {   
                details[0] = t1;
                details[1] = t2;
                getDetails(root.right,x,details,status);
            }
        }
    }

    public static boolean isCousins(TreeNode root, int x, int y) 
    {
        //int[] node1Details = getDetails(root,x,0,0);
        int[] details = {0,0};
        boolean[] status = new boolean[1];        
        getDetails(root,x,details,status);
        System.out.println(Arrays.toString(details));
        int p1 = details[0];
        int h1 = details[1];
        details[0] = 0;
        details[1] = 0;   
        status[0] = false;
        getDetails(root,y,details,status);
        System.out.println(Arrays.toString(details));
        if(p1!=details[0] && h1==details[1])
            return true;
        else
            return false;
    }

    public static void main(String[] args)
    {
        TreeNode root = new TreeNode(1,null,null);
        TreeNode n1 = new TreeNode(2,null,null);
        TreeNode n2 = new TreeNode(3,null,null);
        TreeNode n3 = new TreeNode(4,null,null);
        TreeNode n4 = new TreeNode(5,null,null);
        //TreeNode n5 = new TreeNode(0,null,null);
        root.left = n1;
        root.right= n2;
        n1.right = n3;
        n2.right = n4;
        

        Trees.display(root);

        isCousins(root,4,5);

    }
}

