class TestIf5 {
    public static void main(String[] args) {

        int x = 15;

        if (x < 10) {
            System.out.println("1st if");
        }

        if (x > 10) {
            System.out.println("2nd if");

            if (true) {   // valid condition
                System.out.println("3rd if");
            }
        }
    }
}
