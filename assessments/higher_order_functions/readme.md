# Java Solving Problems with Higher Order Functions

## Approach

As you progress through the list of problems below, pick a different pairing technique (Ping Pong Pairing, Pólya's method, Restricting techniques, etc. or create your own) for each problem.

For each problem, begin by first writing a failing test and then making it pass. Repeat this process until all required functionality for the problem has been implemented. At each passed test, make sure to ask yourself if what you have done is the _minimum_ required to make the test pass. Refactor the code if you see an opportunity to.

Although these are not production problems, treat them as if they are. Think through edge cases (if any exist) and make sure that at all steps you use tests to document your thoughts about what the code should do.

Work together with each other and communicate as you go. Sometimes communication with a pair can be "can we take five minutes to solve this on paper apart from each other and then re-group?" Effective communication does not necessitate non-stop talking, but it does necessitate communicating what you are thinking about the problem at hand.

## Problems

1. Implement a function `map` which has the same functionality as [`java.util.stream.map`](https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html#map-java.util.function.Function-) but does not use `java.util.stream.map()`. Implement your function so that the first argument is the `List<>` and the second argument is the callback.
1. Write a function, `all`, which takes a `List<>` and callback function as parameters. The callback function should return a `Boolean` value. If _every_ element of the array returns `true` when the callback is supplied the element as an argument, then `all` returns `true`, otherwise it returns `false`. For example `all(Arrays.asList(2,4,6), (num) -> num % 2 == 0 )` would return `true`.
1. Write a function, `any`, which takes an array and callback function as parameters. The callback function should return a `Boolean` value. If _any_ element of the array returns `true` when the callback is supplied the element as an argument, then `any` returns `true`, otherwise it returns `false`. For example `any(Arrays.asList(1,4,7), (num) -> num % 2 == 0 )` would return `true`.
1. Implement a function `forEach` which has the same functionality as [`java.util.stream.forEach`](https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html#forEach-java.util.function.Consumer-) but does not use `java.util.stream.forEach`. Implement your function so that the first argument is the array and the second argument is the callback.
1. Create your own problem that can be solved with a higher order function.
1. [stretch] Since `map`, `filter`, and `reduce` each produce a new `List<>`, they can be chained together. In a single, chained set of method calls for the body, write a function that accepts a list of strings as a parameter and returns the average length of strings with more than 10 characters.

Implement all these as static methods in a class called `ListOps` in the default package.

## Reflection

Stop coding approximately 15 minutes before the end of the exercise and have a discussion with your pair.

Some questions to answer as a pair:

  1. What characterizes a higher order function? Write it down.
  1. Did we write tests before code at all points in time?
  1. Did we communicate openly and effectively?
  1. Did one member of the pair dominate the session?
  1. Was there a specific pairing technique that was effective?
