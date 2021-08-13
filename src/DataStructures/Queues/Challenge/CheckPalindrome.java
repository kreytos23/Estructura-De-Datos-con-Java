package DataStructures.Queues.Challenge;

import DataStructures.Queues.Challenge.CharacterQueue.CharacterQueue;
import DataStructures.Stacks.Palindrome.CharStack.CharStack;

public abstract class CheckPalindrome {
    static public boolean checkPalindrome(String string){
        CharStack stack = new CharStack();
        CharacterQueue queue = new CharacterQueue();
        string = string.toLowerCase().trim().replaceAll("\\s","");
        for (int i = 0; i < string.length(); i++) {
            if(Character.isLetter(string.charAt(i))){
                queue.add(string.charAt(i));
                stack.push(string.charAt(i));
            }
        }
        while (!stack.isEmpty()){
            if(stack.pop() != queue.remove()){
                return false;
            }
        }
        return true;
    }
}
