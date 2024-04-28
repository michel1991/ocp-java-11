#### You have an existing java application that contains the following packages -
com.acme.provisioning.client
com.acme.provisioning.service
com.acme.provisioning.dto
com.acme.provisioning.database

The dependency of classes in these packages is as follows -

Classes in the client package use classes from the service and the dto package.
Classes in the service package use classes from the dto and the database package
Classes in the database package use classes from the dto package.
Classes in the dto package do not use classes from any other package.

You want to modularize the application into three modules - client, service, and dto.
Which of the following would be a valid module-info for the service module?

* A.
```
module acme.provisioning.service{
    exports com.acme.provisioning.service;
    exports com.acme.provisioning.database;
    requires acme.provisioning.dto;
}
```


Since database package is not used by any other module, there is no need to export it from the service module.
Technically, it is not incorrect to do so. But unnecessary exports should be avoided and that is why this option is not as good as option 2

* B
```
module acme.provisioning.service{
    exports com.acme.provisioning.service;
    requires acme.provisioning.dto;
}
``` 
* C
```
module acme.provisioning.service{
    exports com.acme.provisioning.service;
    requires com.acme.provisioning.database;
    requires acme.provisioning.dto;
}
``` 
Since database package is not a separate module, you can't put requires com.acme.provisioning.database;
* D
Since there are four interdependent packages in the app, it cannot be modularized into three modules.
Ideally, it should be modularized into four modules (client, service, database, and dto).
However, it is possible to merge service and database packages into one module.
Correct(B)