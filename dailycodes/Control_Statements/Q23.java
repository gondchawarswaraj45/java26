class TestOR4 {
    public static void main(String[] args) {

        int x = 10;

        if (x > 10 || x++ > 10) {
            System.out.println(x);
        } 
        else {
            System.out.println("else");
        }
    }
}
