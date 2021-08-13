package DataStructures.Queues.LinkedListQueues;

import DataStructures.Queues.ArrayQueues.ArrayQueues;
import DataStructures.Queues.ArrayQueues.Employee;

public class QueueJDKMain {
    public static void main(String[] args) {
        DataStructures.Queues.ArrayQueues.Employee janeJones = new DataStructures.Queues.ArrayQueues.Employee("Jane", "Jones", 123);
        DataStructures.Queues.ArrayQueues.Employee johnDoe = new DataStructures.Queues.ArrayQueues.Employee("John", "Doe", 4567);
        DataStructures.Queues.ArrayQueues.Employee marySmith = new DataStructures.Queues.ArrayQueues.Employee("Mary", "Smith", 22);
        DataStructures.Queues.ArrayQueues.Employee mikeWilson = new DataStructures.Queues.ArrayQueues.Employee("Mike", "Wilson", 3245);
        DataStructures.Queues.ArrayQueues.Employee billEnd = new Employee("Bill", "End", 78);

        ArrayQueues queue = new ArrayQueues(10);
        queue.add(janeJones);
        queue.add(johnDoe);
        queue.add(marySmith);
        queue.add(mikeWilson);
        queue.add(billEnd);
        //queue.printQueue();

        queue.remove();
        queue.remove();
        //queue.printQueue();

        //System.out.println(queue.peek());
        queue.remove();
        queue.remove();
        queue.remove();
        //queue.remove();

        queue.add(mikeWilson);


        queue.printQueue();
    }
}
