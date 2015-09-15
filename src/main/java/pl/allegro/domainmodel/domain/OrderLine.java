package pl.allegro.domainmodel.domain;

public class OrderLine {
    private final String productId;
    private final String productName;
    private final Price itemPrice;
    private final Price totalPrice;
    private final int amount;

    public OrderLine(Product product, int amount) {
        this.productId = product.getId();
        this.productName = product.getName();
        this.itemPrice = product.getPrice();
        this.totalPrice = itemPrice.multiply(amount);
        this.amount = amount;
    }
}
