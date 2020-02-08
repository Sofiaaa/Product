package gr.codehub.product;

public class SimpleRetailStore implements IStore{
    private double totalSellBalance;
    private double totalBuyBalance;

    public SimpleRetailStore() {
        this.totalBuyBalance = 0;
        this.totalSellBalance = 0;
    }

    @Override
    public void sell(Product product) {
        totalSellBalance += product.getPriceWhenSell();
    }

    @Override
    public void buy(Product product) {
        totalBuyBalance += product.getPriceWhenBuy();
    }

    @Override
    public double getRevenue() {
        return totalSellBalance-totalBuyBalance;
    }
}
