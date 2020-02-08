package gr.codehub.product;

import java.util.ArrayList;
import java.util.List;

public class InventoryRetailStore extends SimpleRetailStore{
    List<Product> products;

    public InventoryRetailStore() {
        super();
        products = new ArrayList<>();
    }

    @Override
    public void sell(Product product) {
        if(products.contains(product)){
            super.sell(product);
            products.remove(product);
        }else{
            System.out.println("The product doesn't exist!");
        }
    }

    @Override
    public void buy(Product product) {
        if(!products.contains(product)) {
            products.add(product);
            super.buy(product);
        }else{
            System.out.println("The product already exists!");
        }
    }
    public void showAllProducts(){
        products.forEach(Product::showProduct);
    }

}
