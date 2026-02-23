package IO;

import java.io.Serializable;

public class Product implements Serializable {

    private int id;
    private String name;
    private int price;

    public Product() {}

    public Product(String name, int price, int id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    public Product(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Product{id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price + '}';
    }
}
