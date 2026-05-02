class NestedWhileExample {
    public static void main(String[] args) {

        int y = 4;
        int x = 0;

        while (x < 3) {

            while (y > 1) {
                System.out.println(x);
                y--;
            }

            x++;
        }
    }
}
