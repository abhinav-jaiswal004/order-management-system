package services.ordering;

import model.Address;
import model.Item;
import model.Order;
import model.OrderStatus;

import java.util.Map;

public interface OrderManager {
  Order createOrder(Integer customerId, Map<Item, Integer> itemsInfo, Address address);
  boolean updateOrder(Integer orderId, OrderStatus orderStatus);
}
