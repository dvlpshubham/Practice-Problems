import java.util.Arrays;

public class PrimeNumbersList {

    public static void main(String[] args) {
        int[] arr = new int[100];
        int temp = 0;
        int k =0;
        for (int no = 2; no <= 100; no++)
        {
            for (int i = 2; i < no - 1; i++)
            {
                if (no % i == 0)
                {
                    temp = temp + 1;
                }
            }
            if (temp == 0) {
                //System.out.println(no);
                for (int i = 0; i < arr.length; i++)
                {
                    if (no > 10)
                    {
                        arr[k] = no;
                        k++;
                       // System.out.print(arr[i]+",");
                    }

                    break;
                }
            }else
            {
                temp=0;

            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
