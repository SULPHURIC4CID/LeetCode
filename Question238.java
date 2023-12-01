public class Question238
{
    public static int[] productExceptSelf(int[] nums) 
    {
        int[] answer = new int[nums.length];

        answer[0] = 1;
        //Find prefixes O(n)            
        for(int i = 1;i<nums.length;i++)
        {
            answer[i] = answer[i-1]*nums[i-1]; 
        }

        //Iterate backwards for suffix
        int suffix = 1;
        for(int i = nums.length-1;i>=0;i--)
        {
            answer[i] = answer[i] * suffix;
            suffix = suffix * nums[i];
        }
        return answer;
    }

    public static void main(String[] args)
    {

    }
}