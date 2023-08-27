# Exercises
## Exercise 1
### Middle Function
Write a function called middle that takes an array and returns a new array that contains all but the first and last elements.

## Solution

```java
public class Exercise {
    public static int[] middle(int[] array) {
        if (array.length <= 2) {
            return new int[0]; // Return an empty array if the input array has 2 or fewer elements
        }
 
        // Create a new array with a size of the input array length minus 2
        int[] middleArray = new int[array.length - 2];
 
        // Copy the elements from the input array, excluding the first and last elements
        int index = 1;
        while (index < array.length - 1) {
            middleArray[index - 1] = array[index];
            index++;
        }
 
        return middleArray;
    }
}
```

## Exercise 2
### 2D Arrays
Given 2D array calculate the sum of diagonal elements.

## Solution

```java
public class Exercise {
    public static int sumDiagonalElements(int[][] array) {
        int sum = 0;
        int numRows = array.length;
 
        for (int i = 0; i < numRows; i++) {
            sum += array[i][i];
        }
 
        return sum;
    }
}
```

## Exercise 3
### Best Score
Given an array, write a function to get first, second best scores from the array and return it in new array.
Array may contain duplicates.

## Solution

```java
import java.util.*;
public class Exercise {
    public static int[] findTopTwoScores(int[] array) {
        int firstHighest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
 
        for (int score : array) {
            if (score > firstHighest) {
                secondHighest = firstHighest;
                firstHighest = score;
            } else if (score > secondHighest && score < firstHighest) {
                secondHighest = score;
            }
        }
 
        return new int[]{firstHighest, secondHighest};
    }
}
```

## Exercise 4
### Missing Number
Write Java function called ```findMissingNumberInArray``` that takes an integer array containing n-1 unique elements from a range of 1 to n, with one missing number, and returns the missing number.

Hint: Use the formula ```(n * (n + 1)) / 2```which  calculates the sum of the first n natural numbers.

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
