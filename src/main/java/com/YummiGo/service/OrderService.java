package com.YummiGo.service;

import com.YummiGo.model.Order;
import com.YummiGo.model.User;
import com.YummiGo.request.OrderRequest;

import java.util.List;

public interface OrderService {

    Order createOrder(OrderRequest order, User user) throws Exception;

    Order updateOrder(Long orderId,String orderStatus)throws Exception;

    void cancelOrder(Long orderId)throws Exception;

    List<Order> getUsersOrder(Long userId)throws Exception;

    List<Order> getRestaurantsOrder(Long restaurantId,String orderStatus)throws Exception;

    Order findOrderById(Long orderId)throws Exception;
}
