
/*
 * dNode.java
 * Sahithra Kesavan
 * 
 * This file has a generic node class named dNode for a singlw linked list

 */

public class dNode<T> {
   
	T data;
    dNode<T> next;
    dNode<T> previous; //refernce to the previoys node for circular structure

    public dNode() 
    {
    	//empty node
        this(null, null, null);
    }

    public dNode(T data) 
    {
    	//making node with given data, settinghead and tail to null
        this(data, null, null);
    }

    public dNode(T data, dNode<T> next, dNode<T> previous) 
    {
    	//making a node with the given data, next, and previous node reference
        this.data = data;//data in the node
        this.next = next; //refernce to the next node
        this.previous = previous; //refernce to the previosu node
    }
}

