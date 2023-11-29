import java.util.*;

public class Question118
{
    public static List<List<Integer>> generate(int numRows) 
    {
        List<List<Integer>> result = new ArrayList<>();
        if(numRows == 0)
            return result;
        
        List<Integer> row1 = new ArrayList<>();
        row1.add(1);
        result.add(row1);
        for(int i = 1;i<numRows;i++)
        {
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            for(int j = 0;j<result.get(i-1).size()-1;j++)
            {
                List<Integer> temp2 = result.get(i-1);
                temp.add(temp2.get(j)+temp2.get(j+1));
            }
            temp.add(1);
            result.add(temp);
        }
        return result;
    }

    public static void main(String[] args)
    {
        int numRows = 1;
        List<List<Integer>> result = generate(numRows);
        System.out.println(result);
    }
}