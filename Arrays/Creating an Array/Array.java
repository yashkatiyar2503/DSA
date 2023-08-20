import java.util.*;
public class Array
{
    public static void main(String[] args) {
        int m[];
        m=new int[5]; // Declare + Instantiate an array - Method 1
        int n[]=new int[5]; //Declare + Instantiate an array - Method 2
        int a[]={100,50,70,80,25}; // Declare + Initialize an array
        for (int b: a) {
            System.out.println(b);
        } //Print an array
    }
}
