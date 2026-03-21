class AtmSystem {
    public static void main(String[] args) {
        boolean cardValid = true;
        int enteredpin = 1234;
        int actualpin = 1234;

        if(cardValid) {

            if(enteredpin == actualpin){
                System.out.println("Withdrawal Allowed");
            } else {
                System.out.println("Incorrect PIN");
            }

        } else {
            System.out.println("Invalid Card");
        }
    }
}
