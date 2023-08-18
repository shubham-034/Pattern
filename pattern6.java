public class pattern6
{
    public static void main(String args[])
    {
        for(int i=1;i<=5;i++)
        {
            // spaces =5-i
            for(int j=1;j<=5-i;j++)
            {
                System.out.print(" ");
            }

            // stars =5
            for(int k=1;k<=5;k++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}