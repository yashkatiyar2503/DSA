import java.util.*;
public class Array {
    int arr[] = null;
    public Array(int s)
    {
        arr=new int[s];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=Integer.MIN_VALUE;
        }
    }
    public void insert(int loc,int val)
    {
        try
        {
            if(arr[loc]==Integer.MIN_VALUE)
            {
                arr[loc]=val;
                System.out.println("Value inserted successfully");
            }
            else
            {
                System.out.println("This cell is already occupied");
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid index to access array");
        }
    }
    public static void main(String[] args) {
        Array obj=new Array(3);
        obj.insert(0, 10);
        obj.insert(1, 20);
        obj.insert(2, 30);
        int firstElement=obj.arr[0]; //accessing first element of array
        System.out.println(firstElement);
        int thirdElement=obj.arr[2]; //accessing third element of array
        System.out.println(thirdElement);
        int fifthElement=obj.arr[4]; //accessing fifth element of array
        System.out.println(fifthElement); //throws an exception as array contains only 3 elements
    }
}