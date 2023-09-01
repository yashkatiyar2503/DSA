## Exercise 6
### Finding a Number in an Array
Write a program to to check if an array contains a number in Java.

## Solution

```java
class Main {
  public static void main(String[] args) {
    Main mn = new Main();
    int[] intArray = {1,2,3,4,5,6};
    mn.linearSearch(intArray, 7);

  }

  // Search Method
  public void linearSearch(int[] intArray, int value) {
    for(int i=0; i<intArray.length; i++) {
      if (intArray[i] == value) {
        System.out.println("Value is found at the index of " + i);
        return;
      }
    }
    System.out.println(value + " is not found");
  }
}

```
