import java.util.ArrayList;
import java.util.Arrays;

public class PerfectNumber
{
    public static boolean isPerfect(int n)
    {
        int sum=0;
        for (int i=1;i<=n/2;i++)
        {
            if (n%i==0)
                sum=sum+i;
        }
        if (sum==n)
            return true;
        else
            return false;
    }

    public static void main(String[] args)
    {
        for (int i=1;i<500;i++)
        {
            if (isPerfect(i)==true)
            {
                System.out.println(i + " : Perfect Number");
            }
            else
                System.out.println(i + " : Not a Perfect Number");
        }

    }
}