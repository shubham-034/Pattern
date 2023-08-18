public class pattern7
{
    public static void main (String args[])
    {
        for(int i=1;i<=5;i++)
        {
            //spaces= 5-i
            for(int j=1;j<=(5-i);j++)
            {
                System.out.print(" ");
            }

            // boundary stars
            for(int m=1;m<=5;m++)
            {
                if(i==1 ||i==5 || m==1 || m==5)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }  
    }
}