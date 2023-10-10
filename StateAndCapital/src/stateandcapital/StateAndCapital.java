
package stateandcapital;

import java.util.Map;
import java.util.Scanner;

public class StateAndCapital {

   
    public static void main(String[] args) {
        // get map obj
        Map<String, String> stateCapitalMap = StateCapitalMap.populateStateAndCapital();
        
        // scanner 
        Scanner input = new Scanner(System.in);
        
        
        // System.out.println("Entering the loop");
        // while loop for entering a state
        while (true) {
            // prompt
            System.out.print("Enter a state (or 'exit' to quit): ");
            // state var for input, trim whitespace
            String state = input.nextLine().trim();
            
            // if user enters exit end loop
            if (state.equalsIgnoreCase("exit")) {
                break;
            }
            
            // handle lowercase states by calling method that capitalizes first letter
            state = capitalizeFirstLetter(state);
            
            // get the capital for the state in hashmap
            String capital = stateCapitalMap.get(state);
            
            // if there is a capital print it with the state
            if (capital != null) {
                System.out.println("The capital of " + state + " is " + capital);
            } else {
                System.out.println("State not found.");
            }
        }
       // System.out.println("Exiting the loop");
    }   
    
    // capitilize the first letter so program wont say state not found for lowercase
    private static String capitalizeFirstLetter(String input) {
            if (input == null || input.isEmpty()) {
                return input;
            }
            return Character.toUpperCase(input.charAt(0)) + input.substring(1);

        }
}




