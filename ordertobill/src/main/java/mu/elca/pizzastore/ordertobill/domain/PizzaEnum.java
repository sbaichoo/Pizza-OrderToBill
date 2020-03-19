package mu.elca.pizzastore.ordertobill.domain;

public class PizzaEnum {

    public enum pizzaType {
        cheese(200), veggie(250), chicken(275);
        public Integer integer; pizzaType(Integer integer){this.integer = integer;}
    }

    public enum base {thin(30), thick(50); public final Integer integer; base(Integer integer){this.integer = integer;}}

    public enum toppings {olive(10), jalapenos(10), pepperoni(10), no(0) ;public Integer extra;   toppings(Integer extra){this.extra = extra;}

    }
}
