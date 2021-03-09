/**
 * Node --- program that holds data for a node, with the 
 * data, previous node, and previous node.
 * @author  Preston Garcia
 */
public class Node{ // Node class

   private char data;
   private Node prev = null;
   private Node next = null;
   
   /**
     * Constructor that takes the data for the node, and sets
     * the data of the node to the given character.
     * @param data The data of the created node.
     */
   public Node(char data){ // Node constructor
   
      this.data = data;
   
   } // Node constructor
   
   /**
     * Sets the node in front of the current node.
     * @param newNode the next node to be set.
     */
   public void setNext(Node newNode){ // setNext method
   
      this.next = newNode;
   
   } // setNext method
   
   /**
     * Sets the node behind the current node.
     * @param newNode the previous node to be set.
     */
   public void setPrev(Node newNode){ // setPrev method
   
      this.prev = newNode;
   
   } // setPrev method
   
   /**
     * Returns the node in front of the current node.
     * @return The next member variable of the node object.
     */
   public Node getNext(){ // getNext method
   
      return this.next;
   
   } // getNext method
   
   /**
     * Returns the node behind the current node.
     * @return The prev member variable of the node object.
     */
   public Node getPrev(){ // getPrev method
   
      return this.prev;
   
   } // getPrev method
   
   /**
     * Returns the data of the current node.
     * @return The data member variable of the node object.
     */
   public char getData(){ // getData method
   
      return this.data;
   
   } // getData method

} // Node class