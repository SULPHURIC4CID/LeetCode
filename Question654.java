public class Question654
{
    public static int findMaxIndex(int[] nums, int leftIndex, int rightIndex)
    {
        int max = Integer.MIN_VALUE;
        int maxIndex = leftIndex;
        for(int i = leftIndex;i<=rightIndex;i++)
        {
            if(nums[i]>max)
            {
                max = nums[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static TreeNode getTree(int[] nums, int leftIndex, int rightIndex)
    {
        int maxIndex = findMaxIndex(nums,leftIndex,rightIndex);
        TreeNode root = new TreeNode(nums[maxIndex],null,null); 

        //Split nums array
        int prefixLeftIndex = leftIndex;
        int prefixRightIndex = maxIndex-1;

        int suffixLeftIndex = maxIndex+1;
        int suffixRightIndex = rightIndex;

        //attach root.left
        if(prefixLeftIndex<=prefixRightIndex) //num exists on the left
        {
            root.left = getTree(nums,prefixLeftIndex,prefixRightIndex);
        }

        //attach roor.right
        if(suffixLeftIndex<=suffixRightIndex) //num ecists on the right
        {
            root.right = getTree(nums,suffixLeftIndex,suffixRightIndex);
        }

        return root;        

    }

    public static TreeNode constructMaximumBinaryTree(int[] nums) 
    {
        /*
        Pseudo Code-
        1. Find max in nums and have split nums into two arrays using indexes
        2. Fix max as root.
        3. fix root.left with same method.
        4. Fix root.right with the same method.
        5. Continue this process till no element of nums remains.
        */
       TreeNode root = getTree(nums,0,nums.length-1);
       return root;

    }

    public static void main(String[] args)
    {
        int[] nums = {3,2,1};
        TreeNode root = constructMaximumBinaryTree(nums);
        Trees.display(root);
    }
}