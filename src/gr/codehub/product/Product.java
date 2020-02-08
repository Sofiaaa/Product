package gr.codehub.product;

public class Product {
    private int id;
    private String name;
    private double priceWhenBuy;
    private double priceWhenSell;

    public Product(int id, String name, double priceWhenBuy, double priceWhenSell) {
        this.id = id;
        this.name = name;
        this.priceWhenBuy = priceWhenBuy;
        this.priceWhenSell = priceWhenSell;
    }

    public double getPriceWhenBuy() {
        return priceWhenBuy;
    }

    public double getPriceWhenSell() {
        return priceWhenSell;
    }

    public void showProduct(){
        System.out.println("Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", priceWhenBuy=" + priceWhenBuy +
                ", priceWhenSell=" + priceWhenSell +
                '}');
    }

}
