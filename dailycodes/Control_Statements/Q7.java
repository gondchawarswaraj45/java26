class TestIf6 {
    public static void main(String[] args) {

        int x = 15;

        if (x > 10) {
            System.out.println("2nd if");

            if (false) {
                System.out.println("3rd if");
            }
        }
    }
}
