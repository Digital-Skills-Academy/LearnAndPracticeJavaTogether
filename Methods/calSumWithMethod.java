
/**
 * Write a description of class calSumWithMethod here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class calSumWithMethod
{
    public static void main(String[] args){
        //Calling method with 10 as input 
	sumOfInteger(10);
        //Calling method with 30 as input 
	sumOfInteger(30);
	//Calling method with 50 as input 
	sumOfInteger(50);

    }
    
    public static void sumOfInteger(int upperLimit) {

	int sum = 0;
	for(int i=1; i<= upperLimit; i++){
		sum += i;
	}
	System.out.println("The sum from 1 to " + upperLimit 	+ " is: " + sum);

    }

}
