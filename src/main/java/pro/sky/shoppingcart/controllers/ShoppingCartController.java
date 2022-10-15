package pro.sky.shoppingcart.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.shoppingcart.services.ShoppingCartServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/order")
public class ShoppingCartController {

    public final ShoppingCartServiceImpl shoppingCartInterface;

    public ShoppingCartController(ShoppingCartServiceImpl shoppingCartServiceImpl) {
        this.shoppingCartInterface = shoppingCartServiceImpl;
    }

    @GetMapping("/add")
    public String addItem (@RequestParam List<Integer> IDs) {
        shoppingCartInterface.add(IDs);
        return "Items successfully added to cart!";
    }
    @GetMapping("/get")
    public List<Integer> getCart() {
        return shoppingCartInterface.get();
    }
}
