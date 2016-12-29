### Liskov Substitution Principle Problem Set

In this exercise, we are presented with a common problem: we must synchronize our database with an external one (SAP).

To do this, we use what we learned earlier in the course to wrap the SapApi in an adapter class, allowing us to intercept all calls to SAP.

Unfortunately, the implementation created by the previous (now terminated) developer does not satisfy the requirements, and thus we have failing tests.

Our job is to alter the code-under-test to meet the requirements and get the tests to pass.

## Requirements

1. `SapAdapter` should have two retrieval methods: `getEmployeesAsUser()` and `getEmployeesAsCeo()`
1. `getEmployeesAsUser()` should return a (yet to be written) `ImmutableEmployeeList` class, which does not have a `clear()` method
1. `getEmployeesAsCeo()` should return a (yet to be written) `MutableEmployeeList` class that contains a `clear()` method
1. When `MutableEmployeeList.clear()` is invoked, `SapApi.fireEveryone()` should be called as a result.
1. `MutableEmployeeList` and `ImmutableEmployeeList` should be related to each other in a way that satisfies the LSP    
1. The correct access modifiers should be used to prevent classes outside of the `com.example` package from removing employees, except through the methods above

## Rules

1. The `SapAdapterTest` represents desired functionality, and cannot be altered during this exercise
1. The code in the `com.sap` package represents code written and maintained by SAP, and cannot be altered.

