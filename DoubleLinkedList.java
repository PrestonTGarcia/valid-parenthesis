public class DoubleLinkedList{ // Double Linked List class

   private Node first = null;
   private Node last = null;
   
   public DoubleLinkedList(){ // DoubleLinkedList constructor
   
   } // DoubleLinkedList constructor
   
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
   
   } // addNode method
   
   public Node removeLastNode(){ // removeNode method
   
      Node removedNode = this.last;
      
      if (first == last){ // if there is only a first node
      
         removedNode = this.last;
         this.first = null;
         this.last = null;
      
      } // if there is only a first node
      
      else{ // if there is more than one node in the linked list
     
         last = this.last.getPrev();
         last.setNext(null); 
      
      } // if there is more than one node in the linked list
      
      return removedNode;
   
   } // removeNode method

} // Double Linked List class