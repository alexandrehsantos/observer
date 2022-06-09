package com.bulvee.observer;

import com.bulvee.observer.listener.BillingListener;
import com.bulvee.observer.listener.DeliveryListener;
import com.bulvee.observer.listener.Listener;
import com.bulvee.observer.nofifier.SalesOrderNotifier;
import com.bulvee.observer.sales.SalesOrderLoader;

public class Main {

    public static void main(String[] args) {

        SalesOrderNotifier salesOrderNotifier = new SalesOrderNotifier();
        SalesOrderLoader salesOrderLoader = new SalesOrderLoader();

        Listener deliveryListener = new DeliveryListener(salesOrderNotifier);
        Listener billingListener = new BillingListener(salesOrderNotifier);


        salesOrderNotifier.registerListener(deliveryListener);
        salesOrderNotifier.registerListener(billingListener);
        salesOrderNotifier.newSalesOrders(salesOrderLoader.load("/SalesOrders.xml"));
        salesOrderNotifier.notifyListeners();
    }

}
