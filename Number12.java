
/**
 * Write a description of class Number12 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Number12{
    public static void main (String [] args){
        int[] arr = {3, 1, 3, 7, 3, 9};
           int value = 3;
           int count = 0;
           boolean appears3Times = false;

               for (int n : arr) {
           if (n == value) count++;
        if (count >= 3) {
          appears3Times = true;
          break;
           }
           }

        System.out.println(appears3Times ? "YES" : "NO");
    }
    }