# Questions & Answers

## What is the purpose of the various auxiliary methods `populateList`, `populateFifoList`, and `ReverseLines.printReverse`?
The purpose is to use recursion to solve the problem, so the orignial method would not be limited to `list size` or `input` numbers.

## Why do these methods need to have arguments, and how does the argument change from one recursive call to the next?
Recursion is a function calling itself with modified arguments each time, therefore, they need their arguments.<br>
Arguments of `populateList` and `populateFifoList` change from the `node` to its next linked `node`. Arguments of `ReverseLines.printReverse` change to next user input.

## What are the time and space complexity of each of the `populateList` `populateFifoList` methods, as well as `ReverseLines.printReverse`?
- `populateList()`: T(n) =O(n); S(n) =O(n);
- `populateFifoList()`: T(n) =O(n); S(n) =O(n);
- `ReverseLines.printReverse()`: T(n) =O(n); S(n) =O(n);

## Which of these methods can be implemented using `while` loops?
- `populateList()`: cannot be implemented using `while` loops. Using `while` loop makes `testAsListNonempty` into an infinit loop, and other tests after it can not be reached.
- `populateFifoList()`:cannot be implemented using `while` loops. Using `while` loop makes `testAsFifoListNonempty` into an infinit loop, and other tests after it can not be reached.
- `ReverseLines.printReverse()`: can be implemented using `while` loops ;