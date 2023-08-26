package com.marcosfabiano.desafio1jsp.services;
import com.marcosfabiano.desafio1jsp.entities.Order;
import org.springframework.stereotype.Service;
@Service
public class ShippingService {
    public double shipment(Order order) {
        if (order.getBasic() < 100.0) {
            return 20.0;
        } else if (order.getBasic() < 200) {
            return 12.0;
        } else {
            return 0;
        }
    }
}

