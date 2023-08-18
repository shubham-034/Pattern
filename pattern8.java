public class pattern8
{
    public static void main (String args[])
    {
        // upper pattern
        for(int i=1;i<=4;i++)
        {
            // spaces = 4-i
            for(int j=1;j<=(4-i);j++)
            {
                System.out.print(" ");
            }

            // stars = 2*i - 1
            for(int m=1;m<=(2*i)-1;m++)
            {
                System.out.print("*");
            }

            System.out.println();
        }

         // lower pattern
        for(int i=4;i>=1;i--)
        {
            // spaces = 4-i
            for(int j=1;j<=(4-i);j++)
            {
                System.out.print(" ");
            }

            // stars = 2i - 1
            for(int m=1;m<=(2*i)-1;m++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}