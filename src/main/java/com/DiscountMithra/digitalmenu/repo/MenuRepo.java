package com.DiscountMithra.digitalmenu.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.DiscountMithra.digitalmenu.model.Menu;
import java.util.List;

public interface MenuRepo extends JpaRepository<Menu, Long> {
    List<Menu> findByRestaurantId(Long restaurantId);
}
