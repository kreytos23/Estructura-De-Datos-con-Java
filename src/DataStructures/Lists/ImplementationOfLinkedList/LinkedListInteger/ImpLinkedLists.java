package DataStructures.Lists.ImplementationOfLinkedList.LinkedListInteger;

import DataStructures.Lists.ImplementationOfLinkedList.Employee;

public class ImpLinkedLists {
    public static void main(String[] args) {
        LinkedLists lista = new LinkedLists();

        lista.addSortedNumbers(5);
        lista.addSortedNumbers(1);
        lista.addSortedNumbers(11);
        lista.addSortedNumbers(7);
        lista.addSortedNumbers(4);

        lista.printList();
    }
}
