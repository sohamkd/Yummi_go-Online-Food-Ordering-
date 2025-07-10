package com.YummiGo.service;

import com.YummiGo.model.Category;
import com.YummiGo.model.Food;
import com.YummiGo.model.Restaurant;
import com.YummiGo.request.CreateFoodRequest;

import java.util.List;

public interface FoodService {

    Food createFood(CreateFoodRequest req, Category category, Restaurant restaurant);

    void deleteFood(Long foodId) throws Exception;

    List<Food> getRestaurantsFood(Long restaurantId,
                                  boolean isVegeterian,
                                  boolean isNonveg,
                                  boolean isSeasonal,
                                  String foodCategory);

    List<Food> searchFood(String keyword);

    Food findFoodById(Long foodId)throws Exception;

    Food updateAvailabilityStatus(Long foodId) throws Exception;
}
