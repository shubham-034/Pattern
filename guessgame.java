import java.util.*;
public class guessgame
{
    public static void main(String args[])
    {
        Scanner in = new Scanner (System.in);
        {
            System.out.println("WELCOME TO  'GUESS THE NUMBER'");
            String name;
            String check;
            System.out.print("Please Enter Your Name ------> ");
            name=in.next();
            System.out.println("Hello "+name);
            System.out.println("Type 'yes' if want to Play the Game or 'no' to exit");
            System.out.print("Your Answer ------> ");
            check=in.next();
            if(check.equals("yes"))
            {
                Random random=new Random();
                int number=random.nextInt(20)+1;
                int k=0;
                System.out.println("Guess a Number Between 1 to 20");
                for(int i=0;i<=4;i++)
                {
                    System.out.print("Input The Number You Guessed "+name+"-------> ");
                    int n=in.nextInt();
                    if(n==number)
                    {
                        System.out.println("Wow You Guessed Right the Random Number is " + n+ " In Your "+(i+1)+" Try");
                        System.out.println("Congratulation "+name+" You Won");
                        k=1;
                        break;
                    }
                    else if( n>number)
                    {
                        System.out.println("Oops Wrong Guess");
                        System.out.println(" HINT : 'The Number Is Less Than "+n);
                    }
                    else if( n<number)
                    {
                        System.out.println("Oops Wrong Guess");
                        System.out.println(" HINT : 'The Number Is Greater Than "+n);
                    }
                }
                if(k==0)
                {
                    System.out.println(" Oops You Tried 5 Times But Could't Guess");
                    System.out.println(" The Number Was : "+number);
                    System.out.println(" You Lost");
                    System.out.println(" Game Auto Exit");
                }
            }
            else if(check.equals("no"))
            {
                System.out.println(name +" You Selected To Exit The Game");
                System.out.println("Game Exited");
            }
            else
            {
                System.out.println("Wrong Choice ???????");
                System.out.println("Game Exited");
            }
        }
    }
}
