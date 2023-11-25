#### Given the dependencies in the diagram, which boxes represent
#### the service provider interface and service provider, respectively?
[image](images/spi_sp.jpg)
* A. W and X
* B. W and Z
* C. X and Y
* D. X and Z
* E. Y and Z
* F. None of the above

All parts of a modules service must point to the service provider interface.
This tells us the service provider interface must be X, ruling out options A, B, and E.
Now we have to decide if Y or Z are the service provider interface(to remove).
We can tell because nothing has a direct dependency on the service provider.
Since this makes the service provider Y, the answer is option C.

#### The service locator and service provider interface share a module.
#### Which boxes represent the consumer and service provider, respectively?
[image](images/not_reference_to_share_module_x_z_y_.jpg)
* A. X and Y
* B. X and Z
* C. Y and Z
* D. Z and Z
* E. Z and Y
* F. None of the above

The consumer needs to depend on the shared module, making it X.
The shared module then has to be Z, and the service provider has to be Y.
However, the service provider should not know about the consumer,
and the dotted line in the diagram does not make sense.
This means none of the options can create a valid scenario,
and option F is the correct answer.

##### The service locator and service provider interface share a module.
##### Which boxes represent the consumer and service provider, respectively?
[image](images/x_z_share_module.jpg)
* A. X and Y
* B. X and Z
* C. Y and Z
* D. Z and Z
* E. Z and Y
* F. None of the above

The consumer needs to depend on the shared module, making it X.
The shared module then has to be Z, and the service provider has to be Y.
This makes option A correct.

### Using the diagram, which boxes represent the consumer and service locator, respectively?
[image](images/find_consumer_service_locator.jpg)
* A. W and X
* B. W and Z
* C. X and Y
* D. X and Z
* E. Y and Z
* F. None of the above

The consumer depends on the service provider interface and service locator,
but not the service provider.
Only W has two arrows starting from it so it must be the consumer.
This rules out options C, D, and E.
The service locator references the service provider interface directly
and the service provider indirectly,
making the service locator Z and option B the answer.