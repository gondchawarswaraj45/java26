class BreakExample2 {
    public static void main(String[] args) {

        int i = 3;

        if (i % 3 == 0) {
            break;   // ❌ ERROR
        }

        System.out.println(i);
    }
}
