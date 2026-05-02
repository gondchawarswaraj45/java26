class IfElse2 {
    public static void main(String[] args) {

        int x = 10;

        if (x >= 10 && x < 20) {
            System.out.println(x);
        } 
        else {
            System.out.println("else");
        }

        System.out.println(x); // outside if-else
        System.out.println(x);
    }
}
