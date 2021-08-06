package DataStructures.Lists.ImplementationOfLinkedList;

public class ImpLinkedLists {
    public static void main(String[] args) {
        LinkedLists lista = new LinkedLists();

        lista.add(new Employee("Manuel", "Cabello", 12340));
        lista.add(new Employee("Laurita", "Monroy", 4340));
        lista.add(new Employee("Papa", "Angel", 140));

        lista.printList();
        //lista.seeNodes();

        lista.popFirstNode();

        lista.printList();

    }
}
