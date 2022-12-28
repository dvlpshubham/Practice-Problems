import java.util.Arrays;

public class DifferentArray {
    public static void main(String[] args) {
        int[] arr2 = new int[5];
        int[] arr5 = new int[4];
        int[] arr = {6, 2, 35, 4, 75, 85, 12, 22, 15};
        int j = 0;
        int k = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if ((arr[i] % 2) == 0)
            {
                arr2[j] = arr[i];
                j = j + 1;

            } else if ((arr[i] % 5) == 0)
            {
                arr5[k] =arr[i];
                k=k+1;

            }
        }
       /* for (int i = 0; i < arr.length; i++)
        {
            if ((arr[i] % 5) == 0)
            {
            arr5[k] =arr[i];
            k=k+1;
            }

        } */
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr5));
    }
}