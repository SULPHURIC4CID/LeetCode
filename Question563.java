public class Question563
{
    public static int getSum(TreeNode root)
    {
        int sum = 0;    
        sum+=root.val;
        if(root.left!=null)
            sum+=getSum(root.left);
        if(root.right!=null)
            sum+=getSum(root.right);    
        return sum;
    }

    public static void getTilt(TreeNode root,int[] tiltSum)
    {
        int lValue = 0;
        if(root.left != null)
            lValue = getSum(root.left);
        
        int rValue = 0;
        if(root.right!=null)
            rValue = getSum(root.right);
        
        tiltSum[0]+=Math.abs(rValue-lValue);

        if(root.left!=null)
            getTilt(root.left,tiltSum);
        if(root.right!=null)
            getTilt(root.right,tiltSum);
    }

    public static int findTilt(TreeNode root) 
    {
        if(root==null)
            return 0;
        int[] tiltSum = new int[1];        
        getTilt(root,tiltSum);
        return tiltSum[0];        
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

        int result = findTilt(root);
        System.out.println("Tilt : "+result);

    }
}