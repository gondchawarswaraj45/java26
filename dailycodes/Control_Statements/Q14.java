class TestElseIf4 {
    public static void main(String[] args) {

        int x = 10;

        if (x < 10) {
            System.out.println("1st if");
        } 
        else if (x == 10) {

            if (x == 15) {
                System.out.println("inside 2nd if");
            }
        } 
        else {
            System.out.println("else");
        }
    }
}
