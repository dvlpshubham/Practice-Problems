import java.util.Scanner;

public class Fibnoocci
{
    public void checkFib()
    {
        int range,a=0,b=1,c;
        System.out.println("Enter the range you want to print the series : ");
        Scanner sc = new Scanner(System.in);
        range=sc.nextInt();
        for (int i=0;i<=range;i++)
        {
            System.out.print(a+ "  ");
            c=a+b;
            a=b;
            b=c;
        }

    }
    public static void main(String[] args)
    {
        Fibnoocci fibnoocci = new Fibnoocci();
        fibnoocci.checkFib();
    }
}
