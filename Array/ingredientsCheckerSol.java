import java.util.Scanner;
/**
 * Write a description of class ingredientsChecker here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ingredientsCheckerSol
{
   public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
    
        String[] ingredients = {"egg","onion","tomato","garlic","butter","chicken"};
        
        System.out.print("How many ingredients do you need:");
        int noOfIngredientsNeeded = kb.nextInt();
        
        String[] ingredientsNeeded = new String[noOfIngredientsNeeded];
        
        for(int i=0; i<ingredientsNeeded.length;i++){
            System.out.print("Input the ingredient no. " + (i+1) + " :");
            ingredientsNeeded[i] = kb.next();
        }
        
        int ingredientsMatched =0;
        boolean[] ingredientsCheckList = new boolean[noOfIngredientsNeeded];
        
        for(int i=0; i<ingredientsNeeded.length;i++){
            for(int j=0; j<ingredients.length;j++){
                if(ingredientsNeeded[i].equalsIgnoreCase(ingredients[j])){
                    ingredientsMatched++;
                    ingredientsCheckList[i] = true;
                    break;
                }
            }
        }
        
        if(ingredientsMatched==noOfIngredientsNeeded){
            System.out.println("You have all the ingrdients needed for cooking.");
        } else {
            System.out.println("You have NOT all the ingrdients needed for cooking.");
            for(int i=0; i<ingredientsNeeded.length;i++){
                if(ingredientsCheckList[i]==false){
                    System.out.println("Missing ingredient: " + ingredientsNeeded[i]);
                }
            }
        }    
    }
}
