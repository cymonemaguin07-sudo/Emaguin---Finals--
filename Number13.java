
/**
 * Write a description of class Number13 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Number13
{
    public static void main(String [] args){
        int[] grades = {80, 60, 95, 70, 88};
        int pass = 0, fail = 0;

        for (int g : grades) {
            if (g >= 75) pass++;
               else fail++;
                 }

        System.out.println("Passed: " + pass);
         System.out.println("Failed: " + fail);
    }
    }