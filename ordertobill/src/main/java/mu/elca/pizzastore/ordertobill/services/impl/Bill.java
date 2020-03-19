package mu.elca.pizzastore.ordertobill.services.impl;

import mu.elca.pizzastore.ordertobill.domain.Pizza;
import mu.elca.pizzastore.ordertobill.domain.PizzaEnum;

public class Bill {

    private Integer totalPrice;
    private String currency = "RS";
    private Order order;

    public Bill(Order order, String currency, Integer totalPrice) {
        this.order = order;
        this.totalPrice = totalPrice;
        this.currency = currency;
    }

    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Bill() {
    }

    public Bill getBill(Order order, Integer totalPrice) {
        return new Bill(order,currency, totalPrice);
    }

    static public Integer getPricePizza(Pizza pizza) {
        return PizzaEnum.pizzaType.valueOf(pizza.getPizzaType()).integer + PizzaEnum.base.valueOf(pizza.getBase()).integer;
    }

    static public Integer getPriceToppings(String toppings) {
        String [] ArraysToppings =  toppings.split(" ");
        Integer totalPriceToppings = 0;
        for (var eachTopping : ArraysToppings) {
            totalPriceToppings += PizzaEnum.toppings.valueOf(eachTopping).extra;
        }
        return totalPriceToppings;
    }
}
