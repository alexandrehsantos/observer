package com.bulvee.observer.nofifier;

import com.bulvee.observer.listener.Listener;
import com.bulvee.observer.model.Order;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SalesOrderNotifier implements Notifier {

    private Set<Listener> listeners = new HashSet<>();
    private List<Order> salesOrders = new ArrayList<Order>();

    @Override
    public void registerListener(Listener listener) {
        this.listeners.add(listener);
    }

    @Override
    public void removeListener(Listener listener) {
        this.listeners.remove(listener);
    }

    @Override
    public void notifyListeners() {
        listeners.forEach(Listener::update);
    }

    @Override
    public void newSalesOrders(List<Order> salesOrders) {
        this.salesOrders.addAll(salesOrders);
    }

    @Override
    public List<Order> getSalesOrders() {
        return this.salesOrders;
    }
}
