import java.util.*;

public class Array {
    public static int linearSearch(int arr[], int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int x) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (x == arr[mid]) {
                return mid;
            } else if (x > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = Sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements in sorted order:");
        for (int i = 0; i < n; i++) {
            arr[i] = Sc.nextInt();
        }
        System.out.print("Enter the element to search: ");
        int x = Sc.nextInt();
        
        int linearResult = linearSearch(arr, x);
        if (linearResult != -1) {
            System.out.println("Linear Search: Element found at index " + linearResult);
        } else {
            System.out.println("Linear Search: Element not found");
        }
        
        int binaryResult = binarySearch(arr, x);
        if (binaryResult != -1) {
            System.out.println("Binary Search: Element found at index " + binaryResult);
        } else {
            System.out.println("Binary Search: Element not found");
        }
    }
}
