public class FindPairOfSum {

    public static void findSum(int num) {
        int sum = 0;
        /* in while loopjust check
         * sum is not less than or equals to 9
         */
        while (num > 0 || sum > 9) {
            if (num == 0) {
                num =sum;     // swapping in each rotations
                sum = 0;
            }
            sum = sum + num % 10;// (0+123456)10 =1- 6 ->2- 6+5=11
            System.out.println(sum);
            num = num / 10;// delete last digit 12345
        }
        System.out.println("sum: "+sum);

    }

    public static void main(String[] args) {
        int num = 5874123;//1+2+3+4+5+6 = 21
        //2+1 = 3;
        findSum(num);
    }

}