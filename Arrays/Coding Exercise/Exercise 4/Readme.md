## Exercise 4
### Missing Number
Write Java function called ```findMissingNumberInArray``` that takes an integer array containing n-1 unique elements from a range of 1 to n, with one missing number, and returns the missing number.

Hint: Use the formula ```(n * (n + 1)) / 2``` which  calculates the sum of the first n natural numbers.

## Solution

```java
public class Exercise {
  public static int findMissingNumberInArray(int[] array) {
        int n = array.length + 1;
        int expectedSum = (n * (n + 1)) / 2;
        int actualSum = 0;
 
        for (int number : array) {
            actualSum += number;
        }
 
        return expectedSum - actualSum;
    }
}
```
