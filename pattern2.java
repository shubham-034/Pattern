public class pattern2
{
    public static void main(String args[])
    {
        for(int i=1;i<=4;i++)
        {
            //spaces
            for(int m=4-i;m>=1;m--)
            {
                System.out.print(" ");
            }

            //stars
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}