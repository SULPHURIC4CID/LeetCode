public class Question832
{
    public static void flip(int[][] image)
    {
        for(int i = 0;i<image.length;i++)
        {
            for(int j =0;j<image.length/2;j++)
            {
                //swap left and right
                int temp = image[i][j];
                image[i][j] = image[i][image.length-1-j]; 
                image[i][image.length-1-j] = temp;
            }
        }
    }

    public static void invert(int[][] image)
    {
        for(int i = 0;i<image.length;i++)
        {
            for(int j =0;j<image.length;j++)
            {
                if(image[i][j]==0)
                    image[i][j] = 1;
                else
                    image[i][j] = 0;
            }
        }
    }

    public static int[][] flipAndInvertImage(int[][] image) 
    {
        flip(image);
        invert(image);
        return image;
    }

    public static void main(String[] args)
    {

    }
}