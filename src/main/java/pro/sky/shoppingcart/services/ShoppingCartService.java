package pro.sky.shoppingcart.services;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;
import java.util.stream.Collectors;

@Service
@SessionScope
public class ShoppingCartService implements ShoppingCartServiceImpl {

    private List<Integer> itemList;

    public ShoppingCartService(List<Integer> itemList) {
        this.itemList = itemList;
    }

    @Override
    public void add(List<Integer> IDList) {
        itemList = IDList.stream()
                .collect(Collectors.toList());
    }

    @Override
    public List<Integer> get() {
        return itemList;
    }
}
