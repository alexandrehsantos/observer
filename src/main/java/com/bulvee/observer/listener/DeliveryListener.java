package com.bulvee.observer.listener;

import com.bulvee.observer.model.Order;
import com.bulvee.observer.nofifier.Notifier;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class DeliveryListener implements Listener {
    private Notifier notifier;

    private DeliveryListener() {
    }

    public DeliveryListener(Notifier notifier) {
        this.notifier = notifier;
        notifier.registerListener(this);
    }

    @Override
    public void update() {
        List<Order> salesOrders = this.notifier.getSalesOrders();
        log.info("Received bellow orders in delivery system: ");
        salesOrders.forEach(order ->
                log.info(order.toString())
        );
    }
}
