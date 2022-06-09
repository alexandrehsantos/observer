package com.bulvee.observer.nofifier;

import com.bulvee.observer.listener.Listener;
import com.bulvee.observer.model.Order;
import com.bulvee.observer.model.SalesOrders;

import java.util.List;

public interface Notifier {

    void registerListener(Listener listener);
    void removeListener(Listener listener);
    void notifyListeners();
    void newSalesOrders(List<Order> salesOrders);
    List<Order>  getSalesOrders();
}
