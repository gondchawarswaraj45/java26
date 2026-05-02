class DivisibleBy3And4 {
    public static void main(String[] args) {

        for (int x = 1; x <= 30; x++) {

            if (x % 3 == 0 && x % 4 == 0) {
                System.out.println(x);
            }
        }
    }
}
