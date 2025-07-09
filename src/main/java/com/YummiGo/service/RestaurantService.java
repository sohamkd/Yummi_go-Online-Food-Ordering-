package com.YummiGo.service;

import com.YummiGo.model.Restaurant;
import com.YummiGo.model.User;
import com.YummiGo.request.CreateRestaurantRequest;

import java.util.List;

public interface RestaurantService {

    public Restaurant createRestaurant(CreateRestaurantRequest req, User user);

    public Restaurant updateRestaurant(Long restaurantId,CreateRestaurantRequest updatedRestaurant) throws Exception;

    public void deleteRestaurant(Long restaurantId);

    public List<Restaurant> getAllRestaurant();

    public List<Restaurant> searchRestaurant();

    public Restaurant findRestaurantById(Long id) throws Exception;

}
