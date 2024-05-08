### Given:

```
module broker{
    exports org.broker.api;
    provides org.broker.api.Broker with org.broker.api.MyBroker
}
``` 

Which of the following statements are correct?

* A. This is not a valid service definition module because it provides the service instead of defining it.
    There is no technical restriction on providing implementation along with definition of a service.

* B. This is not a valid service provider module because it does not contain appropriate requires clause for service definition.
    There is no need for a requires clause because the service definition (i.e. org.broker.api.Broker ) is in the same module.

* C. ther modules can also provide implementations for org.broker.api.Broker service.
    They can do so by providing an implementation of org.broker.api.Broker.

* D. Placing the org.broker.api package in a separate module named brokerapi would make it easy to install multiple provider modules.
The purpose of placement of the service interface in a separate module is to create a logical separation between a service definition and its providers.
It is also helpful in reducing the footprint (i.e. size) of service definition module.

"Easy to install" is not a very clear phrase. However, we have seen this in the real exam.
Based on the feedback that we have received, we believe it is a correct option although we do not believe it to be technically accurate.

Even in this case, where the service definition contains a service implementation,
other provider modules can implement the same service and can be installed.
They would have to use the same "requires broker;" clause even if there was no implementation of the Broker interface in the broker module.
The module that uses the service will also still need to use just one "requires broker;" clause in its module definition.
It is not a good idea to include MyBroker and Broker in the same module because
that allows the user of the service to inadvertantly depend on the implementation class.


* E. It is not a good idea to include MyBroker and Broker in the same module because that allows the user of the service to inadvertantly depend on the implementation class.

Correct(C,D, E)