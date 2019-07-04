package shopping_basket_example;

public class Product {

    private String title;
    private double price;
    private String code;

    public Product(String title, double price, String code) {
        this.title = title;
        this.price = price;
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
