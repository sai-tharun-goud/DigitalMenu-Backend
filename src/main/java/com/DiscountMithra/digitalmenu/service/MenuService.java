package com.DiscountMithra.digitalmenu.service;

import com.DiscountMithra.digitalmenu.model.Menu;
import com.DiscountMithra.digitalmenu.repo.MenuRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {
    private final MenuRepo menuRepo;

    public MenuService(MenuRepo menuRepo) {
        this.menuRepo = menuRepo;
    }

    public List<Menu> getAllMenus() {
        return menuRepo.findAll();
    }

    public List<Menu> getMenusByRestaurant(Long restaurantId) {
        return menuRepo.findByRestaurantId(restaurantId);
    }
}
