
/**
 * Write a description of class Number1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Number1{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int num;
        
        do{
            System.out.print("Enter Number Between 1 & 100: ");
            num = sc.nextInt();
        }while (num < 1 ||num >100);
        
        System.out.println("Valid Number: " + num);
    }
    }
