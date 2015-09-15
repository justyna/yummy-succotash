package pl.allegro.domainmodel.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Order {
    private final List<OrderLine> orderLines = new ArrayList<OrderLine>();
    private final Customer customer;
    private Address shippingAddress;
    private Price totalAmount;

    public Order(Customer customer) {
        this.customer = customer;
    }

    public List<OrderLine> getOrderLines() {
        return Collections.unmodifiableList(orderLines);
    }

    public void addToOrder(Product product, int amount) {
        removeFromOrder(product);
        final OrderLine orderLine = new OrderLine(product, amount);
        orderLines.add(orderLine);
        totalAmount = totalAmount.add(orderLine.getTotalPrice());
        calculateDiscount();
    }

    public void removeFromOrder(Product product) {
        // implementation left to your imagination
    }

    /* rest of implementation left out for brevity */
}
