public class Question99 
{
    public static TreeNode getMax(TreeNode node)
    {
        TreeNode temp = null;
        if(node == null)
            return temp;
        int max = Integer.MIN_VALUE;
        if(node.val>=max)
        {
            max = node.val;
            temp = node;
        }
        if(node.left!=null)
        {
            int value = getMax(node.left).val;
            if(value>=max)
            {
                max=value;
                temp = getMax(node.left);
            }
        }
        if(node.right!=null)
        {
            int value = getMax(node.right).val;
            if(value>=max)
            {
                max = value;
                temp = getMax(node.right);
            }
        }
        return temp;
    }

    public static TreeNode getMin(TreeNode node)
    {
        TreeNode temp = null;
        if(node == null)
            return temp;
        int min = Integer.MAX_VALUE;
        if(node.val<=min)
        {
            min = node.val;
            temp = node;
        }
        if(node.left!=null)
        {
            int value = getMin(node.left).val;
            if(value <=min)
            {
                min=value;
                temp = getMin(node.left);
            }
        }
        if(node.right!=null)
        {
            int value = getMin(node.right).val;
            if(value<=min)
            {
                min = value;
                temp = getMin(node.right);
            }
        }
        return temp;
    }

    public static void check(TreeNode node, boolean[] found)
    {
        if(found[0] == false) //if the pair hasnt been found yet
        {
            int currVal = node.val;

            TreeNode lNode = getMax(node.left);
            System.out.println("LNODE VAL:"+lNode.val);
            TreeNode rNode = getMin(node.right);

            boolean lCheck = false;
            boolean rCheck = false;

            if(lNode!=null)
            {
                lCheck = lNode.val>currVal;                
            }
            if(rNode!=null)
            {
                rCheck = rNode.val<currVal;                
            }

            System.out.println("LCheck : "+lCheck+" rcheck :"+rCheck);
            if(lCheck==true && rCheck==false)
            {
                //swap
                int temp = lNode.val;
                lNode.val = currVal;
                node.val = temp;
                found[0] = true;
            }
            else if(lCheck==false && rCheck==true)
            {
                //swap
                int temp = rNode.val;
                rNode.val = currVal;
                node.val = temp;
                found[0] = true;
            }
            else if(rCheck==false && lCheck==false)
            {
                //Dig deeper in the tree
                if(node.left!=null) //Checking left subtree
                {
                    check(node.left,found);
                }
                if(node.right!=null) //Checking right subtree
                {
                    check(node.right,found);
                }
            }
            else if(rCheck==true && lCheck==true)
            {
                System.out.println("Rnode val"+rNode.val+" lnode val :"+lNode.val);
                //Swap the lNode and rNode values;
                int temp = lNode.val;
                lNode.val = rNode.val;
                rNode.val = temp;
                found[0] = true;
            }
        }
    }

    public static void recoverTree(TreeNode root) 
    {
       boolean[] found = new boolean[1];
       found[0] = false;
       check(root,found);
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
        r1.left = rr2;
        r1.right = last;
        rr2.right = last;
        ll2.left = lastnew;
        lastnew.left =  lastnew2;

        Trees.display(root);
        recoverTree(root);
        Trees.display(root);
    }
}
