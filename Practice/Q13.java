class FoodOrder {

    String itemName;
    int quantity;
    double price;

    FoodOrder(String itemName) {
        this.itemName = itemName;
        this.quantity = 1;
        this.price = 100.0;
    }

    FoodOrder(String itemName, int quantity) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = 100.0;
    }

    void displayOrder() {
        double total = quantity * price;
        System.out.println("Item Name: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price per item: " + price);
        System.out.println("Total Bill: " + total);
    }

    public static void main(String[] args) {

        FoodOrder order1 = new FoodOrder("Pizza");
        order1.displayOrder();

        System.out.println();

        FoodOrder order2 = new FoodOrder("Burger", 3);
        order2.displayOrder();
    }
}
