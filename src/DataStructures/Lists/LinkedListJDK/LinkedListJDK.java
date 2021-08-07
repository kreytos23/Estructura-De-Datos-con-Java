package DataStructures.Lists.LinkedListJDK;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListJDK {
    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        /*LinkedList<Employee> list = new LinkedList<>();
        list.addFirst(janeJones);
        list.addFirst(johnDoe);
        list.addFirst(marySmith);
        list.addFirst(mikeWilson);

        Iterator iter = list.iterator();
        System.out.print("HEAD -> ");
        while (iter.hasNext()) {
            System.out.print(iter.next());
            System.out.print("<=>");
        }
        System.out.println("null");

        list.addLast(billEnd);
        iter = list.iterator();
        System.out.print("HEAD -> ");
        while (iter.hasNext()) {
            System.out.print(iter.next());
            System.out.print("<=>");
        }
        System.out.println("null");

        list.removeFirst();
        iter = list.iterator();
        System.out.print("HEAD -> ");
        while (iter.hasNext()) {
            System.out.print(iter.next());
            System.out.print("<=>");
        }
        System.out.println("null");

        list.removeLast();
        iter = list.iterator();
        System.out.print("HEAD -> ");
        while (iter.hasNext()) {
            System.out.print(iter.next());
            System.out.print("<=>");
        }
        System.out.println("null");*/

//        for (Employee employee: list) {
//            System.out.println(employee);
//        }

        LinkedList<Employee> listOffer = new LinkedList<>();
        Employee mike = new Employee("Mike", "Wilson", 3245);
        Employee bil = new Employee("Bill", "End", 78);
        Employee manuel = new Employee("Luis", "papa",478956);
        listOffer.add(mike);
        listOffer.add(bil);
        listOffer.add(manuel);
        Iterator iter = listOffer.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
