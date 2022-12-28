

public class StringArray {
    public static void main(String[] args) {
        char[] arr ={'a','b','c','d','e','f'};
        String str = new String(arr);
        System.out.print("orignal string : ");
        System.out.println(str);
        System.out.print("Reversed String : ");
        int len = str.length();
        for (int i=len-1;i>=0;i--) {
            System.out.print(str.charAt(i)+ " ");
        }

    }
}
