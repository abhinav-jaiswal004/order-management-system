package utility;

import exception.SellerNotFoundException;
import model.Seller;
import services.inventory.InventoryManager;
import services.inventory.external.CoolCompanyInventoryManager;
import services.inventory.internal.FlipkartInventoryManager;


public class InventoryProvider {
  public static InventoryManager getInventory(Seller seller) throws SellerNotFoundException {
    return switch (seller) {
      case FLIPKART -> new FlipkartInventoryManager();
      case EXTERNAL_COOL_COMPANY -> new CoolCompanyInventoryManager();
    };
  }
}
