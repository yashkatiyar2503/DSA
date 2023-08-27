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
