import java.util.PriorityQueue;

public class Queue_in_JAVA {
    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();

        priorityQueue.add("TamilNadu");
        priorityQueue.add("Karnataka");
        priorityQueue.add("AndhraPradesh");
        priorityQueue.add("Kerala");
        System.out.println("Queue is = " + priorityQueue);
        // Output will be : Queue is = [AndhraPradesh, Karnataka, Kerala, TamilNadu]
        System.out.println("First element in queue(HEAD) is: " + priorityQueue.peek());
        priorityQueue.remove();
        System.out.println("After calling the remove() the queue is: " + priorityQueue);
        System.out.println("Removed Head element is: " + priorityQueue.poll());
    }
}
