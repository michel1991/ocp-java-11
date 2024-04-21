### Given the follow two module definitions:
```
module author{
  requires serviceapi;
  uses api.BloggerService;
}

and

module abc.blogger{
  requires serviceapi;
  provides api.BloggerService with abc.SimpleBlogger;
}

Identify correct statement(s).

```


* A. api.BloggerService should be defined in author module.
* B. api.BloggerService should be defined in abc.blogger module.
* C. api.BloggerService should be defined in serviceapi module.

* D. abc.blogger module should be on --module-path while executing author module but is not required while compiling.
While compilation of the author module, only the serviceapi module is required.

* E. author module should be on --module-path while executing abc.blogger module but is not required while compiling.
abc.blogger module is the provider of the service. It depends only on the serviceapi module (which defines the service).
It does not depend on users of the service.

Correct(C, D)