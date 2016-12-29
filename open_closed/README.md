# SOLID: Open/Closed Principle (OCP)

*Software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification.*

> Tip: Strive to write code that doesn’t have to be changed every time the requirements change.

## Problem

- Choose one of the provided OCP violations below at a time.
- How does the code violate the OCP?
- Draw a class diagram of the current implementation.
- How could you solve the problem?
- Draw a class diagram of the solution, using established design patterns.
- Solve the chosen problem using TDD and Bypass Surgery Refactoring.

## OCP Violations

### a) Promotions

The `Customer` in a pub supports being charged half the price during Happy Hour. According to a new requirement the `Customer` should also support an `Order Three, Get One Free` promotion.

> Package: `com.galvanize.curriculum.xp.ocp.pub`

### b) Shapes

The `Printer` supports drawing circles and rectangles. According to a new requirement the `Printer` should also support drawing squares.

> Package: `com.galvanize.curriculum.xp.ocp.shapes`

### c) Bubble Sort

The current implementation of `BubbleSort` supports ordering students ascending and descending by score. According to a new requirement `BubbleSort` should also support ordering students ascending and descending by last name. Ordering by other (not yet existing) student properties in the future is likely.

> Package: `com.galvanize.curriculum.xp.ocp.sort`

## Testing

Since we are working with legacy code with no tests, the first test should simply assert that the existing output does not change during our refactoring (this [article](http://stackoverflow.com/questions/1119385/junit-test-for-system-out-println) demonstrates how to integration test if a part of the application is writing to `stdout`). Then, as units are refactored out, use TDD and write unit tests to drive the implementation of the units.
