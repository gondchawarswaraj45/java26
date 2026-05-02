class NumberExample {
    public static void main(String[] args) {

        int num = 14739876;
        int count = 0;

        while (num > 0) {

            System.out.println(num);
            num = num / 10;
            count++;
        }

        System.out.println(count);
    }
}
