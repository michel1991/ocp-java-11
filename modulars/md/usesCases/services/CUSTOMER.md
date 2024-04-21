#### Which of the following is a valid module-info for a service user module that uses
#### an Order service defined in OrderServiceAPI module and implemented by OrderServiceProvider module?

* A.
``` java
   module Customer{
     requires OrderServiceAPI;
    uses com.orderservice.api.Order;
 }
```


* B.
``` java
module Customer{
    requires OrderServiceProvider;
    uses com.orderservice.api.Order;
}
```

The Customer module does not need to access the OrderServiceProvider module directly.
It should not even be aware of it. On the other hand, it should require the OrderServiceAPI module.

* C
``` java
    module Customer{
        requires OrderServiceAPI;
        requires OrderServiceProvider;
        uses com.orderservice.api.Order;
    }
```

The requires OrderServiceProvider; is technically valid but logically incorrect.
As explained in option 2, the module that uses a service should not even be aware of the module that provides the service.

* D
``` java
    module Customer{
        uses OrderServiceAPI;
    }
```
As per the problem statement, OrderServiceAPI is not a service. It is a module.
Order is a service.

* E
``` java
module Customer{
    uses OrderServiceAPI;
    requires com.orderservice.api.Order;
}
```

Correct(A, C)