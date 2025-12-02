
/**
 * Write a description of class Number4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Number4{
    public static void main(String [] args){
        int[] arr = {5, 2, 9, 1, 7};
        int smallest = arr[0];
        int largest = arr[0];

       for (int i = 1; i < arr.length; i++) {
       if (arr[i] < smallest) smallest = arr[i];
       if (arr[i] > largest) largest = arr[i];
       }

       System.out.println("Smallest: " + smallest);
       System.out.println("Largest: " + largest);
       }
}