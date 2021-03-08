public class Node{ // Node class

   private char data;
   private Node prev = null;
   private Node next = null;
   
   public Node(char data){ // Node constructor
   
      this.data = data;
   
   } // Node constructor
   
   public void setNext(Node newNode){ // setNext method
   
      this.next = newNode;
   
   } // setNext method
   
   public void setPrev(Node newNode){ // setPrev method
   
      this.prev = newNode;
   
   } // setPrev method
   
   public Node getNext(){ // getNext method
   
      return this.next;
   
   } // getNext method
   
   public Node getPrev(){ // getPrev method
   
      return this.prev;
   
   } // getPrev method

} // Node class