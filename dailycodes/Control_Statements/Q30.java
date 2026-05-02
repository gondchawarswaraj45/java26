class Ter3 {
    public static void main(String[] args) {

        int x = 20, y = 15;

        int res = (x == 10) ? x : y;
        System.out.println(res);

        if (x == 10) {
            System.out.println(x);
        } 
        else {
            System.out.println("else");
        }
    }
}
