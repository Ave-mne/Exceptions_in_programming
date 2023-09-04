package Home_Work_3;


import Home_Work_3.OnlineShop.ProductDatabase;
import Home_Work_3.OnlineShop.ShopManager;
import Home_Work_3.View.OnlineShopUI;

public class Main {
    public static void main(String[] args) {
        ProductDatabase db = new ProductDatabase();
        ShopManager manager = new ShopManager(db);
        OnlineShopUI onlineShopUI = new OnlineShopUI(manager);
        onlineShopUI.run();
    }
}