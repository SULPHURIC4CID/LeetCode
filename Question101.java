import java.util.*;

public class Question101
{
    public static List<Integer> getRow(int rowIndex) 
    {
        List<Integer> result = new ArrayList<>();
        result.add(1);

        for(int i = 0;i<rowIndex;i++)
        {
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            for(int j = 0;j<result.size()-1;j++)
            {
                temp.add(result.get(j)+result.get(j+1));
            }
            temp.add(1);
            result.clear();
            result=temp;
        }
        return result;
    }
    public static void main(String[] args)
    {    
       int rowIndex = 0;
       List<Integer> result = getRow(rowIndex);
       System.out.println(result);
    }
}