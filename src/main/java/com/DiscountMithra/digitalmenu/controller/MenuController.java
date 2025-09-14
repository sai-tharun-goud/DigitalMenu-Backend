package com.DiscountMithra.digitalmenu.controller;

import com.DiscountMithra.digitalmenu.model.Menu;
import com.DiscountMithra.digitalmenu.service.MenuService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/menus")
public class MenuController {
    private final MenuService menuService;

    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    // GET all menus
    @GetMapping
    public List<Menu> getAllMenus() {
        return menuService.getAllMenus();
    }

    // GET menus by restaurant
    @GetMapping("/restaurant/{restaurantId}")
    public List<Menu> getMenusByRestaurant(@PathVariable Long restaurantId) {
        return menuService.getMenusByRestaurant(restaurantId);
    }
}
