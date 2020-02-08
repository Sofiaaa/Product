package gr.codehub.product;

public interface IStore {
    public void sell(Product product);
    public void buy(Product product);
    public double getRevenue();
}
