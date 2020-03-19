# Pizza-OrderToBill
Creating a Pizza Order and Bill using REST API 

## Testing with Postman Guide 

**Here are some samples GET Requests with their JSON Response.**

### GET with Request params with toppings
```
http://localhost:8080/api/order/?pizzaType=veggie&base=thin&toppings=pepperoni+olive

{
    "totalPrice": 300,
    "currency": "RS",
    "order": {
        "orderId": 744,
        "pizza": {
            "pizzaType": "veggie",
            "base": "thin",
            "toppings": "pepperoni olive"
        },
        "readyTime": "09:43:19.3012337"
    }
}

```

### GET with Request params with one topping

```
http://localhost:8080/api/order/?pizzaType=chicken&base=thin&toppings=pepperoni

{
    "totalPrice": 250,
    "currency": "RS",
    "order": {
        "orderId": 692,
        "pizza": {
            "pizzaType": "cheese",
            "base": "thick",
            "toppings": "no"
        },
        "readyTime": "10:26:22.3711791"
    }
}

```

### GET with Request params without toppings

```
http://localhost:8080/api/order/?pizzaType=veggie&base=thin&toppings= 

OR 

http://localhost:8080/api/order/?pizzaType=veggie&base=thin

{
    "totalPrice": 315,
    "currency": "RS",
    "order": {
        "orderId": 518,
        "pizza": {
            "pizzaType": "chicken",
            "base": "thin",
            "toppings": "pepperoni"
        },
        "readyTime": "10:27:57.2192713"
    }
}

```




