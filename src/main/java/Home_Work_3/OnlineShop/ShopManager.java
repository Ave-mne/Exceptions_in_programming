package Home_Work_3.OnlineShop;

import Home_Work_3.Exceptions.ProductDatabaseException;
import Home_Work_3.Exceptions.ShopManagerException;

import java.util.List;

public class ShopManager {
    private final ProductDatabase db;

    public ShopManager(ProductDatabase db) {
        this.db = db;
    }

    public double purchaseProduct(int productId, int quantity) throws ShopManagerException, ProductDatabaseException {
        Product product = db.getProduct(productId);
        if (product.getAvailableQuantity() < quantity) {
            throw new ShopManagerException("Not enough products in stock.");
        }
        double totalPrice = product.getPrice() * quantity;
        db.reduceProductQuantity(product, quantity);
        return totalPrice;
    }

    public List<Product> getAllProducts() {
        return db.getStock();
    }

}