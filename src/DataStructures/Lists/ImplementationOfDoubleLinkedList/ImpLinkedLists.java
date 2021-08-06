package DataStructures.Lists.ImplementationOfDoubleLinkedList;

import DataStructures.Lists.ImplementationOfDoubleLinkedList.Employee;

public class ImpLinkedLists {
    public static void main(String[] args) {
        DoubleLinkedLists lista = new DoubleLinkedLists();

        lista.add(new Employee("Manuel", "Vargas",456));
        lista.add(new Employee("Laurita", "Bazaldua",45655));
        lista.add(new Employee("Luis", "papa",478956));
        lista.add(new Employee("Anita", "Perez",45655));
        lista.add(new Employee("Pepe", "papa",478956));

        /*lista.printList();

        lista.popFirstNode();

        lista.printList();
*/
        lista.addLast(new Employee("Milos", "Gs",45625));
        lista.printList();
        lista.printListReverse();

    }
}
