public class Array
{
    public static void main(String[] args)
    {
        int[] arr = {12,54,87,24,20,32,24,20,47,23,47};
        int temp;
        for (int i=0;i<arr.length;i++)
        {
            for (int j=i+1;j<arr.length;j++)
            {
                if (arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Second largest element in the array is :"+arr[1]);
        System.out.println("Duplicate elements in the array are : ");
        for (int i=0; i<arr.length;i++)
        {
            for (int j=i+1;j<arr.length;j++)
            {
                if (arr[i]==arr[j])
                {
                    System.out.print(arr[i] + " ");

                }

            }

        }
    }

}
