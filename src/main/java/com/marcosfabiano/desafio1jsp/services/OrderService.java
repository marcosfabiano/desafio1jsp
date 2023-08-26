package com.marcosfabiano.desafio1jsp.services;

import com.marcosfabiano.desafio1jsp.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class OrderService {
    @Autowired
    private ShippingService shippingService;
    public double total(Order order) {
        return order.getBasic() - (order.getBasic() * order.getDiscount() / 100)
                + shippingService.shipment(order) ;
    }
}
