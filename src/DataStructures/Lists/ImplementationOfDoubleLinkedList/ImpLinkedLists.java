package DataStructures.Lists.ImplementationOfDoubleLinkedList;

public class ImpLinkedLists {
    public static void main(String[] args) {
        DoubleLinkedLists lista = new DoubleLinkedLists();
        //System.out.println(lista.listSize());
        //System.out.println(lista.listSize());
        Employee manuelito = new Employee("Manuel", "Vargas",456);
        lista.add(manuelito);
        lista.add(new Employee("Laurita", "Bazaldua",45655));
        lista.add(new Employee("Luis", "papa",478956));
        lista.add(new Employee("Anita", "Perez",45655));
        lista.add(new Employee("Pepe", "papa",478956));
        lista.printList();
        /*
        System.out.println(lista.popFinal());
        System.out.println(lista.listSize());

        lista.printList();
        lista.addLast(new Employee("Laurita", "Bazaldua",45655));
        System.out.println(lista.listSize());

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
      /*  System.out.println("//////////////////\n");
        lista.addInter(new Employee("Carlitos", "Perez",4451),2);
        lista.printList();
        System.out.println(lista.popInter(6));
        System.out.println("//////////////////\n");
        lista.printList();
        */
        lista.addBefore(new Employee("Karlita", "Duran",7419),new Employee("Pepe", "papa",478956));
        lista.printList();
        System.out.println(lista.listSize());
    }
}
