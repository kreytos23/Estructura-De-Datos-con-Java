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
        lista.printList();
        /*System.out.println("//////////////////\n");
        System.out.println(lista.popFirstNode());
        //System.out.println("//////////////////\n");
        //lista.printList();
        lista.addLast(new Employee("Milos", "Gs",45625));
        //lista.printList();
        System.out.println("//////////////////\n");
        lista.printListReverse();
        System.out.println("//////////////////\n");
        System.out.println(lista.popFinal());
        System.out.println("//////////////////\n");
        lista.printList();
        System.out.println(lista.listSize());*/
        System.out.println("//////////////////\n");
        lista.addInter(new Employee("Carlitos", "Perez",4451),2);
        lista.printList();
    }
}
