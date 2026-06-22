class Item {
    String itemCode;
    String itemName;
    double price;

    Item(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: ₹" + price);
    }

    double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        Item item = new Item("I101", "Laptop", 45000);

        item.displayDetails();

        int quantity = 2;
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: ₹" + item.calculateTotalCost(quantity));
    }
}