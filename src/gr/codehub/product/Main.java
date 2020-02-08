package gr.codehub.product;

public class Main {
    public static void main(String[] args) {
        Product x1 = new Product(1, "Painting Picasso. Guernica", 100, 1000);
        Product x2 = new Product(2, "Painting Tsarouxis. NaftisA", 200, 2000);
        Product x3 = new Product(3, "Chair. Luis XV", 100, 1000);
        Product x4 = new Product(4, "Vase. Cubic", 500, 5000);

        IStore simple= new SimpleRetailStore();
        simple.buy(x1);
        simple.buy(x3);
        simple.sell(x1);
        simple.sell(x2);
        System.out.println(simple.getRevenue());

        InventoryRetailStore invStore= new InventoryRetailStore();
        invStore.buy(x1);
        invStore.buy(x3);
        invStore.sell(x1);
        invStore.sell(x2);
        System.out.println(invStore.getRevenue());
        invStore.showAllProducts();
    }
}
