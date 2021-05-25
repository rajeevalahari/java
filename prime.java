import java.util.*;
public class prime
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int cout=0;
        for(int i=1;i<=13;i++)
        {
            if(n%i==0)
            {
              cout=cout+1;
            }
        }
        if(cout>2)
        {
            System.out.println("not prime");
        }
        else if(cout==2)
        {
            System.out.println("prime");
        }
        else
        {
            System.out.println("1 is neither prime nor composite");
        }


    }
}