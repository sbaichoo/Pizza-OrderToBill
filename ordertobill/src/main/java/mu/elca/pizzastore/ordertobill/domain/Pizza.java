package mu.elca.pizzastore.ordertobill.domain;

public class Pizza {
    private String pizzaType;
    private String base;
    private String toppings;

    public Pizza(String pizzaType, String base, String toppings) {
        this.pizzaType = pizzaType;
        this.base = base;
        this.toppings = toppings;
    }

    public String getPizzaType() {
        return pizzaType;
    }

    public void setPizzaType(String pizzaType) {
        this.pizzaType = pizzaType;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }
}
