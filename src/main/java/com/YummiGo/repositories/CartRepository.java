package com.YummiGo.repositories;

import com.YummiGo.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart,Long> {

    Cart findByCustomerId(Long userId);

}
