public class Cart {
    private final String cartId;
    private final double[] prices;
    private int count;

    public Cart(String cartId, int capacity) {
        if (capacity < 0) throw new IllegalArgumentException("Capacity cannot be negative");
        this.cartId = cartId;
        this.prices = new double[capacity];
    }

    public String getCartId() { return cartId; }

    public boolean addItem(double price) {
        if (price < 0 || count == prices.length) return false;
        prices[count++] = price;
        return true;
    }

    public double getTotal() {
        double total = 0;
        for (int i = 0; i < count; i++) total += prices[i];
        return total;
    }

    public int getItemCount() { return count; }

    public static void main(String[] args) {
        Cart cart = new Cart("CART-5", 20);
        cart.addItem(250);
        cart.addItem(99);
        cart.addItem(151);
        System.out.printf("Total: %.2f%n", cart.getTotal());
        System.out.println("Count: " + cart.getItemCount());
    }
}
