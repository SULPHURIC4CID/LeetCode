public class Question814
{
    public static boolean contains1(TreeNode node)
    {
        boolean leftSubTree = false;
        boolean rightSubTree = false;
        if(node.val == 1)
            return true;
        else
        {
            //Traverse the tree
            if(node.left!=null) //traverse the left subtree
            {
                leftSubTree = contains1(node.left);
            }

            if(node.right!=null) //traverse the right subtree
            {
                rightSubTree = contains1(node.right);
            }
            return leftSubTree || rightSubTree;
        }
    }

    public static TreeNode pruneTree(TreeNode root) 
    {
        /*
        Pseudo Code-
        1. check if root.left contains 1.
        2. if yes dig deeper in the left subtree.
        3. if not make root.left = null;
        4. check if root.right contains 1
        5. if yes dig deeper.
        6. else make root.right = null;
        */
       System.out.println(root.val);
        if(root.left!=null)
        {
            if(!contains1(root.left))
            {
                root.left = null;
            }
            else
            {
                root.left = pruneTree(root.left);
            }
        }

        if(root.right!=null)
        {
            if(!contains1(root.right))
            {
                root.right = null;
                System.out.println("Y");
            }
            else
            {
                root.right = pruneTree(root.right);
                System.out.println("N");
            }
        }

        if(root.val==0 && root.left==null && root.right==null)
            return null;
        
        return root;
    }

    public static void main(String[] args)
    {
        TreeNode root = new TreeNode(1,null,null);
        TreeNode l1 = new TreeNode(0,null,null);
        TreeNode r1 = new TreeNode(0,null,null);
        TreeNode ll2 = new TreeNode(0,null,null);

        TreeNode rl2 = new TreeNode(0,null,null);
        TreeNode rr2 = new TreeNode(1,null,null);
        //root.left = l1;
        root.right = r1;
        //l1.left = ll2;
        r1.left = rl2;
        r1.right = rr2;

        Trees.display(root);

        TreeNode result = pruneTree(root);
        Trees.display(result);
    }
}

