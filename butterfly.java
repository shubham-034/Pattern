public class butterfly
{
    public static void main(String args[])
    {
        //upper pattern
        for(int i=1;i<=4;i++)
        {
            // stars =i
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }

            //spaces = 2*(4-1)
            for(int m=1;m<= 2*(4-i);m++)
            {
                System.out.print(" ");
            }

            // stars =i
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            
            System.out.println();
        }


          // lower pattern
        for(int i=4;i>=1;i--)
        {
            // stars =i
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }

            //spaces = 2*(4-1)
            for(int m=1;m<= 2*(4-i);m++)
            {
                System.out.print(" ");
            }

            // stars =i
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}