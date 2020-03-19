package mu.elca.pizzastore.ordertobill.controllers;

import mu.elca.pizzastore.ordertobill.domain.Pizza;
import mu.elca.pizzastore.ordertobill.services.impl.Bill;
import mu.elca.pizzastore.ordertobill.services.impl.Order;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/order")
public class PizzaController {

    @GetMapping("/")
    public Bill getOrderToBill(
            @RequestParam(name = "pizzaType") String pizzaType,
            @RequestParam(name = "base") String base,
            @RequestParam(name = "toppings", required = false) String toppings) {

        if (! StringUtils.isNotEmpty(toppings)) {
            toppings = "no";
        }

        Pizza pizza = new Pizza(pizzaType, base, toppings);

        Order order = new Order().getOrder(pizza);

        Integer totalPrice = Bill.getPricePizza(pizza)+ Bill.getPriceToppings(toppings);

        return new Bill().getBill(order, totalPrice);
    }
}
