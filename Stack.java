/**
 * Stack --- program that has the methods for a stack and holds
 * data in the stack ADT. Uses doubly linked list implementation.
 * @author   Preston Garcia
 */
public class Stack{ // Stack class

   private DoubleLinkedList stack = null;
   
   /**
     * Constructor for the stack, sets the stack
     * to an empty linked list.
     */
   public Stack(){ // Stack constructor
   
      this.stack = new DoubleLinkedList();
   
   } // Stack constructor
   
   /**
     * Pushes a new node in the stack with the data of the specified
     * char.
     * @param newChar The data of the node to be added
     * @return Whether or not the char was added.
     * NOTE: Originally I was going to have error checking and return false
     * if there was an error but I decided it would be easier to see what's
     * happening with this.
     */
   public boolean push(char newChar){ // push method
   
      stack.addNode(newChar);
      return true;
   
   } // push method

   /**
    * Removes the topmost node of the stack and returns the data
    * of the node.
    * @return The removed character
    */
   public char pop(){ // pop method
   
      return this.stack.removeLastNode();
   
   } // pop method
   
   /**
     * Returns the topmost node's data of the stack.
     * @return The char of the top node.
     */
   public char peek(){ // peek method
   
      return this.stack.getLast().getData();
   
   } // peek method
   
   /**
     * Returns if the stack is currently empty.
     * @return Checks if there is a "first" node,
     * which determines if it's empty or not.
     */
   public boolean isEmpty(){ /// isEmpty method
   
      return (this.stack.getFirst() == null);
   
   } // isEmpty method
   
   /**
     * Returns the size of the stack
     * @return The count of the elements in the
     * stack.
     */
   public int size(){ // size method
   
      return this.stack.getCount();
   
   } // size method
   
   /**
     * Returns a string of the stack in a column.
     * @return The string with all the nodes appeneded.
     */
   public String toString(){ // toString method
   
      return this.stack.toString();
   
   } // toString method

} // Stack class