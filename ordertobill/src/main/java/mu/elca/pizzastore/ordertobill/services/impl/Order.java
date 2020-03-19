package mu.elca.pizzastore.ordertobill.services.impl;

import mu.elca.pizzastore.ordertobill.domain.Pizza;

import java.time.LocalTime;
import java.util.Random;

public class Order {

    private Integer orderId;
    private Pizza pizza;
    private LocalTime readyTime;

    public Order(Integer orderId, Pizza pizza, LocalTime readyTime) {
        this.orderId = orderId;
        this.pizza = pizza;
        this.readyTime = readyTime;
    }

    public Order(){}

    public Order getOrder(Pizza pizza){
        LocalTime time = LocalTime.now().plusMinutes(20);
        return new Order(new Random().nextInt(1000),pizza, LocalTime.now().plusMinutes(20));
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public LocalTime getReadyTime() {
        return readyTime;
    }

    public void setReadyTime(LocalTime readyTime) {
        this.readyTime = readyTime;
    }
}
