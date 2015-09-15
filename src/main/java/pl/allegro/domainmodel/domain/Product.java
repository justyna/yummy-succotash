package pl.allegro.domainmodel.domain;

public class Product {
    private String id;
    private String name;
    private Price price;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Price getPrice() {
        return price;
    }
}
