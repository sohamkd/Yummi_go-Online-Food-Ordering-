package com.YummiGo.service;

import com.YummiGo.model.IngredientCategory;
import com.YummiGo.model.IngredientsItem;

import java.util.List;

public interface IngredientsService {

    IngredientCategory createIngredientCategory(String name,Long restaurantId) throws Exception;

    IngredientCategory findIngredientCategoryByID(Long id)throws Exception;

    List<IngredientCategory> findIngredientCategoryByRestaurantId(Long id)throws Exception;

    IngredientsItem createIngredientsItem(Long restaurantId,String ingredientName,Long categoryId)throws Exception;

    List<IngredientsItem> findRestaurantsIngredients(Long restaurantId);

    IngredientsItem updateStock(Long id)throws Exception;
}
