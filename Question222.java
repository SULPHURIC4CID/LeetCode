public class Question222 
{
    public static void move(TreeNode root, boolean[] completed, int level,int depth,int[] count)
    {
        if(completed[0] == false)
        {
            if(level==depth-1)
            {
                if(root.left!=null)
                    count[0]++;
                else
                    completed[0] = true;
                   
                if(root.right!=null)
                    count[0]++;
                else
                    completed[0] = true;
            }
            else
            {
                move(root.left,completed,level+1,depth,count);
                move(root.right,completed,level+1,depth,count);
            }
        }
    }

    public static int countNodes(TreeNode root) 
    {
        TreeNode temp = root;
        int depth = 0;
        while(temp.left!=null)
        {
            depth++;
            temp = temp.left;
        }
        depth++;
        //System.out.println(depth);
        boolean[] completed = new boolean[1];        
        int[] count = new int[1];

        move(root,completed,1,depth,count);
        

        for(int i = 0;i<depth-1;i++)
        {
            count[0]+=(int)Math.pow(2,i);
        }
        System.out.println("Count:"+count[0]);
        return count[0];
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
        countNodes(root);
    }
}
