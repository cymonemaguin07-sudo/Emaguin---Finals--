
/**
 * Write a description of class Number17 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Number17
{
    public static void main(String [] args){
        int[] arr = {5,12,9,21,16};
        int highest = Integer.MIN_VALUE;
        int secondhighest = Integer.MIN_VALUE;
        
        for (int num : arr){
            if (num > highest){
                secondhighest = highest;
                highest = num;
            } else if (num > secondhighest && num != highest){
                secondhighest = num;
            }
            }
        System.out.println("Second highest number: " + secondhighest);
        }  
    }
    