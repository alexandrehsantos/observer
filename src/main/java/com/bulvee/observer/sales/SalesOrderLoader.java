package com.bulvee.observer.sales;

import com.bulvee.observer.model.Order;
import com.thoughtworks.xstream.XStream;

import java.net.URL;
import java.util.List;

public class SalesOrderLoader {

    public List<Order> load(String fileName){

        XStream xStream = new XStream();
        xStream.allowTypes(new Class[]{List.class, Order.class});
        xStream.alias("pedidos", List.class);
        xStream.alias("pedido", Order.class);
        xStream.aliasField("descricao",  Order.class, "description");
        xStream.aliasField("valor",  Order.class, "value");


        URL resourceAsStream = this.getClass().getResource(fileName);

        List<Order> orders = (List<Order>) xStream.fromXML(resourceAsStream);
        return orders;
    }
}
