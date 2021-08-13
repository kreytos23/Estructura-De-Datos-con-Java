package DataStructures.Queues.LinkedListQueues;

import java.util.LinkedList;
import java.util.Queue;

public class QueueJDK {
    LinkedList<Employee> queue;

    public QueueJDK() {
        this.queue = new LinkedList<>();
    }

    public void add(Employee employee){
        queue.addLast(employee);
    }

    public Employee remove(){
        return queue.removeFirst();
    }

    public Employee peek(){
        return queue.peek();
    }

    public void printQueue(){
        for (Employee employee: queue) {
            System.out.println(employee.toString());
        }
    }
}
