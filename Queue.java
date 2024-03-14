//dNode.java
//Sahithra Kesavan
// This file represents a Circulaly double-linked list that can be added to, dequeuced from,and has methods to check i's size, send elements to the back 
public class Queue<T> {

	//first and last node refernces
	 dNode<T> head;
	 dNode<T> tail;
	 private int size; //variable for queue size
	 
	public Queue()
	{
		//making an empty queue 
		this.head = null;
		this.tail = null;
		this.size = 0;
	}
	
	public Queue (T val)
	{
		
	     
	     //making a queue with an initital value by setting head and tail to a node with the intiial value 
		//seting head.next and tail.previous to create a circular structure
		this.head = new dNode<>(val);
		this.tail = this.head;
		this.head.next = this.tail;
		this.tail.previous = this.head;
		this.size = 1;
		
	}
	
	public void enqueue (T val)
	{
	     
		dNode<T> newNode = new dNode<>(val);
		
		if(isEmpty())
		{
			//setting head and tail to new node if queue is empty
			head = newNode;
			tail = newNode;
		}
		else
		{
			//adding element to end of queue an creating new node w given value while adjusting referneces to add it to the end.
			tail.next = newNode;
			newNode.previous = tail;
			newNode.next = head;
			tail = newNode;
			head.previous = tail;
		}
		size++;
	}
	
	public T dequeue()
	{
		if (isEmpty()) 
		{
            return null; // if the queue is empty return null
        }

        T removedData = head.data; // store the data of the node to be removed

        if (size == 1)
        {
            head = null;
            tail = null;// if theres only one element in the queue, clear head and tail
        } 
        else 
        {
            head = head.next; // move head to the next node
            // update circular reference
            head.previous = tail; 
            tail.next = head;
        }

        size--;
        return removedData; //return the data of removed element
    }
			
			
		
		
	
	
	public boolean isEmpty()
	{
		//checks if queue is empty and returns true or false depending on the size
		if(size ==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void sendToBack() 
	{
		//do nothing if size is 1 or less
	    if (size > 1)
	    {
	        T removedData = dequeue(); // remove the first element

	        if (removedData != null) {
	            enqueue(removedData); // enqueue the removed element to the back
	        }
	    }
	}

	
	public int size()
	{
		return size; //returning the current size of the queu
	}
	
	public String toString() 
	{
	    if (isEmpty()) 
	    { //check i queue is empty
	        return "Queue is empty";
	    }

	    dNode<T> current = head;
	    String result = current.data + " | "; // add the first node's data and line
	    // go through the queue until at the head again
	    
	    while (current.next != head) 
	    {
	        current = current.next;
	        result += current.data + " | "; // add and space out data with line
	    }

	    return result.substring(0, result.length() - 3); //remove last line and return the string
	}



		
	
	
}

