/**
 * DoubleLinkedList --- program that holds nodes in a doubly linked list
 * @author              Preston Garcia
 */
public class DoubleLinkedList{ // Double Linked List class

   private Node first = null;
   private Node last = null;
   private int count;
   final char nullChar = '\0';
   
   /**
     * Constructor that sets the initial
     * count of nodes in the doubly linked
     * list to 0.
     */
   public DoubleLinkedList(){ // DoubleLinkedList constructor
   
      this.count = 0;
   
   } // DoubleLinkedList constructor
   
   /**
     * Adds a node to the end of the linked
     * list with the data equal to a specified
     * character.
     * @param newLetter The data of the added
     * node.
     */
   public void addNode(char newLetter){ // addNode method
   
      Node newNode = new Node(newLetter);
      
      if (first == null){ // checks if there's no first node      
      
         this.first = newNode;
      
      } // checks if there's no first node
      
      else{ // if there is a first node
      
         this.last.setNext(newNode);
         newNode.setPrev(this.last);
      
      } // if there is a first node
      
      this.last = newNode;
      this.count++;
   
   } // addNode method
   
   /**
     * Removes the last node of the linked list
     * by setting the last node of the linked list 
     * to the previous of the current last node.
     * @return The data of the removed node.
     */
   public char removeLastNode(){ // removeNode method
   
      Node removedNode = this.last;
      
      
      if (this.first == null){ // if there is no nodes
      
         return nullChar; // returns null because nothing was removed
      
      } // if there is no nodes
      
      else if (this.first == this.last){ // if there is only a first node
      
         this.first = null;
         this.last = null; // sets both to null because they're the only nodes
      
      } // if there is only a first node 
      
      else{ // if there is more than one node in the linked list
     
         this.last = this.last.getPrev();
         this.last.setNext(null);
          
      } // if there is more than one node in the linked list
      
      this.count--;
      return removedNode.getData();
   
   } // removeNode method
   
   /**
     * Returns the count of nodes inside the linked
     * list.
     * @return The count member variable of the linked
     * list object.
     */
   public int getCount(){ // getCount method
   
      return this.count;
   
   } // getCount method
   
   /**
     * Returns the first node in the linked list.
     * @return The first member variable of the linked
     * list object.
     */
   public Node getFirst(){ // getFirst method
   
      return this.first;
   
   } // getFirst method
   
   /**
     * Returns the last node in the linked list.
     * @return The last member variable of the linked
     * list object.
     */
   public Node getLast(){ // getLast method
   
      return this.last;
   
   } // getLast method
   
   /**
     * Returns the node in string form.
     * @return A string containing each of the nodes
     * data in the linked list in a column.
     */
   public String toString(){ // toString method
   
      int tempCount = getCount();
      String returnString = "";
      Node cursor = this.first;
      
      while (cursor != null) { // iterates until count is 0
      
         returnString += cursor.getData() + "\n";
      
      } // iterates until count is 0
      
      return returnString;
   
   } // toString method

} // Double Linked List class