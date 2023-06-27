
/**
 * Write a description of class calSum here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class calSum
{
    public static void main(String[] args){

        //Variable to store the sum of additions
        int sum = 0;
        
        //From 1 to 10
        for (int i = 1; i <= 10; i++) {
        	sum += i;
        }
        System.out.println("Sum from 1 to 10 is: " + sum);

        //reset sum to 0 for next calculation
        sum = 0;
        //From 1 to 30
        for (int i = 1; i <= 30; i++) {
        	sum += i;
        }
        System.out.println("Sum from 1 to 30 is: " + sum);
        
        //reset sum to 0 for next calculation
        sum = 0;
        //From 1 to 50
        for (int i = 1; i <= 50; i++) {
        	sum += i;
        }
        System.out.println("Sum from 1 to 50 is: " + sum);
    }
}
