class ForNoBody {
    public static void main(String[] args) {

        int x = 7;

        for (int i = 1; i <= 5; i++);   // ❌ no loop body
        {
            System.out.println(x);
            x--;
        }
    }
}
