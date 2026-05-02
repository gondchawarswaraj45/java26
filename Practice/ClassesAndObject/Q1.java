class Ride {

    String customerName = new String("Swaraj");
    String pickup = "ShivajiNagar";
    String drop = "Hinjewadi";
    double fare = 350;

    public static void main(String[] args) {

        Ride r1 = new Ride();

        System.out.println("Customer: " + r1.customerName);
        System.out.println("Pickup: " + r1.pickup);
        System.out.println("Drop: " + r1.drop);
        System.out.println("Fare: ₹" + r1.fare);

    }
}
