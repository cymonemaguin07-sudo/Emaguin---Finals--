
/**
 * Write a description of class Number20 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Number20{
    public static void main (String [] args){
        int[] arr = {10, 24, 33, 40, 15, 22};
        for (int num : arr){
            if (num > 20 && num % 2 == 0){
                System.out.println(num);
            }
        }
    }
    }