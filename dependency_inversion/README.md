# SOLID: Dependency Inversion Principle (DIP)

*A. High-level modules should not depend on low-level modules. Both should depend on abstractions.*

*B. Abstractions should not depend on details. Details should depend on abstractions.*

> Tip: Program to interfaces, not implementations.

## Problem

- Choose one of the provided DIP violations below at a time.
- How does the code violate the DIP?
- Draw a class diagram of the current implementation.
- How could you solve the problem?
- Draw a class diagram of the solution, using established design patterns.
- Solve the chosen problem using TDD and Bypass Surgery Refactoring.

## DIP Violations

### a) Cars

The car `App`s violate the DIP. Refactor them using the injection strategy, suggested by the package name.

> Package: `com.galvanize.curriculum.xp.dip.car.*`

### b) Phone

The `SmartPhoneApp` violates the DIP. Refactor it.

> Package: `com.galvanize.curriculum.xp.dip.phone`

### c) Time

Add the missing unit tests for `Clock`.

> Package: `com.galvanize.curriculum.xp.dip.time`

### d) Pizza

The `PizzaStore` violates the DIP. Refactor it.

> Package: `com.galvanize.curriculum.xp.dip.pizza`

### Testing

Since we are working with legacy code with no tests, the first test should simply assert that the existing output does not change during our refactoring (this [article](http://stackoverflow.com/questions/1119385/junit-test-for-system-out-println) demonstrates how to integration test if a part of the application is writing to `stdout`). Then, as units are refactored out, use TDD and write unit tests to drive the implementation of the units.
