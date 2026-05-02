class Ter2 {
    public static void main(String[] args) {

        int x = 20;

        String res = (x == 10) ? "x = " + x : "else";
        System.out.println(res);

        if (x == 10) {
            System.out.println(x);
        } 
        else {
            System.out.println("else");
        }
    }
}
