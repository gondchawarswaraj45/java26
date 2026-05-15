class FoodDelivery {

    String customerName = "Swaraj";
    String address = "Pune";

    void showCustomerDetails() {

        System.out.println("===== Customer Details =====");
        System.out.println("Customer Name : " + customerName);
        System.out.println("Delivery Address : " + address);
    }
}

class OrderFood extends FoodDelivery {

    void placeOrder() {

        System.out.println("\n===== Order Status =====");
        System.out.println("Food order placed successfully for " + customerName + ".");
        System.out.println("Your order is reaching at " + address + " location.");
    }
}

class Client {

    public static void main(String[] args) {

        OrderFood obj = new OrderFood();

        obj.showCustomerDetails();

        obj.placeOrder();
    }
}
