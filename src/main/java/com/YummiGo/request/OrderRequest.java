package com.YummiGo.request;

import com.YummiGo.model.Address;
import lombok.Data;

@Data
public class OrderRequest {

    private Long restaurantId;
    private Address delieveryAddress;
}
