package DataStructures.Queues.Challenge.CharacterQueue;


import java.util.LinkedList;

public class CharacterQueue {
    LinkedList<Character> queue;

    public CharacterQueue() {
        this.queue = new LinkedList<>();
    }

    public void add(Character character){
        queue.addLast(character);
    }

    public Character remove(){
        return queue.removeFirst();
    }

    public Character peek(){
        return queue.peek();
    }

    public void printQueue(){
        for (Character character: queue) {
            System.out.print(character);
        }
        System.out.print("\n");
    }
}
