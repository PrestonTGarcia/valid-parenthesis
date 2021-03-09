/**
 * ValidParenthesis --- Program that tests stack implementation by checking if
 * a string of parenthesis is valid.
 * @author              Preston Garcia
 */
public class ValidParenthesis{ // ValidParenthesis class

   final static char OPENPARENTHESIS = '(';
   final static char OPENBRACKET = '[';
   final static char OPENBRACE = '{';

   /**
     * Tests each of the cases that were specified in the
     * practice prompt
     * @param args command line arguments
     */
   public static void main(String[] args){ // main testing method
   
      System.out.println(isValid("()"));
      System.out.println(isValid("()[]{}"));
      System.out.println(isValid("{[()]}"));
      System.out.println(isValid("([{"));
      System.out.println(isValid("()[{]}"));
   
   } // main testing method
   
   /**
     * Checks if the parenthesis combinations are valid
     * using the algorithm in the pseudocode file of this
     * repository.
     * @param parenthesis Parenthesis sequence.
     * @return whether the sequence is valid or not.
     */
   public static boolean isValid(String parenthesis){ // isValid method
   
      Stack openStack = new Stack();
      
      for (int i = 0; i < parenthesis.length(); i++){ // for loop that iterates through parenthesis
      
         if (isOpen(parenthesis.charAt(i))){ // Checks if it's an open parenthesis/bracket/brace
         
            openStack.push(parenthesis.charAt(i));
         
         } // Checks if it's an open parenthesis/bracket/brace
         
         else{ // assuming it's a close parenthesis/bracket/brace
         
            if (closeChar(openStack.pop()) != parenthesis.charAt(i)){ // checks if it's the right char
            
               return false;
            
            } // checks if it's the right char
         
         } // assuming it's a close parenthesis/bracket/brace
      
      } // for loop that iterates through parenthesis
      
      return openStack.isEmpty();
   
   } // isValid method
   
   /**
     * Checks if the given character is an open parenthesis
     * character.
     * @param open The character being analyzed
     * @return whether or not the character is an open parenthesis
     * or not.
     */
   public static boolean isOpen(char open){ // isOpen method
   
      return (open == OPENPARENTHESIS || open == OPENBRACKET || open == OPENBRACE); 
   
   } // isOpen method
   
   /**
     * Finds and returns the close parenthesis of a given open
     * parenthesis. Uses ASCII values to get close characters.
     * @param open The open parenthesis as a char.
     * @return The close parenthesis of what the user inputs.
     * NOTE: This method assumes that the user entered an open parenthesis.
     */
   public static char closeChar(char open){ // closeChar method
   
      if (open == OPENPARENTHESIS){ // checks if the char is a (
      
         return (open += 1);
      
      } // checks if the char is a (
      
      return (open += 2);
      
   } // closeChar method

} // ValidParenthesis class