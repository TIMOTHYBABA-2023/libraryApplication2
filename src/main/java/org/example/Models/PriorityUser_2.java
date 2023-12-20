package org.example.Models;

import org.example.Models.OrderUser_2;

import java.util.Comparator;

public class PriorityUser_2  implements Comparator<OrderUser_2> {

    @Override
    public int compare(OrderUser_2 o1, OrderUser_2 o2) {
        return o1.getOrderId() < o2.getOrderId() ? 1 : -1;
    }
}
