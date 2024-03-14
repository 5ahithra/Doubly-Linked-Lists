//QueuesTesting.java
//Sahithra Kesavan
//File to test methods from the queue file

public class QueuesTesting {
    public static void main(String[] args)
    {
       
        Queue<Integer> queue = new Queue<>();

       
        System.out.println("Testing enqueue method:");
        System.out.println(queue);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(10);
        queue.enqueue(2456);
        queue.enqueue(838);
        queue.enqueue(134);
        queue.enqueue(2);
        queue.enqueue(35);
        System.out.println(queue);
        
        System.out.println("\nTesting dequeue method:");
        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println(queue);
        
        System.out.println("\nTesting sendToBack method:");
        queue.sendToBack();
        System.out.println(queue);
        
        System.out.println("\nTesting size method:");
        System.out.println("Size of the queue: " + queue.size());
        
        System.out.println("\nTesting toString method:");
        System.out.println("Queue: " + queue.toString());
    }

   
}

