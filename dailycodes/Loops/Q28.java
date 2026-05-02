class TeamSwitch {
    public static void main(String[] args) {

        String choice = "MI"; // user input

        switch (choice) {

            case "MI":
                System.out.println("6 trophies");
                break;

            case "CSK":
                System.out.println("5 trophies");
                break;

            case "RCB":
                System.out.println("49 all out");
                break;

            default:
                System.out.println("Wrong");
        }
    }
}
