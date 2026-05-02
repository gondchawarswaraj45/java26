class MenuDemo {
    public static void main(String[] args) {

        int choice = 4;

        do {
            System.out.println("1: C");
            System.out.println("2: C++");
            System.out.println("3: Python");
            System.out.println("4: Java");
            System.out.println("5: OS");

            // simulate user input
            choice = 4;

            if (choice == 1) {
                System.out.println("C");
            } 
            else if (choice == 2) {
                System.out.println("C++");
            } 
            else if (choice == 4) {
                System.out.println("Java");
            }

        } while (choice != 4);
    }
}
