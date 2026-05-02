class WhileDemo1 {
    public static void main(String[] args) {

        int x = 1;

        while (x <= 10) {

            if (x % 7 == 0) {
                System.out.println(x);
            }

            x++;
        }
    }
}
