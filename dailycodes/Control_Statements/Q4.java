class TestIf4 {
    public static void main(String[] args) {

        int x = 15;

        if (x < 10) {
            System.out.println("inside if");
        }

        if (x > 10) {
            System.out.println("2nd if");
        }

        if (x == 5) {   // corrected (== not =)
            System.out.println("3rd if");
        }
    }
}
