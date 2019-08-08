class Armstrong {
    public static void main(String[] args) {
        int res = 0, digit, temp;
        int num = 153;// It is the number to check armstrong
        temp = num;
        while (num > 0) {
            digit = num % 10;
            res = res + (digit * digit * digit);
            num = num / 10;

        }
        if (temp == res)
            System.out.println("armstrong number");
        else
            System.out.println("Not armstrong number");
    }
}
