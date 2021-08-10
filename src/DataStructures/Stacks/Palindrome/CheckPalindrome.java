package DataStructures.Stacks.Palindrome;

import DataStructures.Stacks.Palindrome.CharStack.CharStack;

public abstract class CheckPalindrome {
    static private CharStack stack = new CharStack();
    static public boolean checkPalindrome(String string){
        string = string.toLowerCase().trim().replaceAll("\\s","");
        String reverse = "",clean = "";
        for (int i = 0; i < string.length(); i++) {
            if(Character.isLetter(string.charAt(i))){
                clean = clean.concat(String.valueOf(string.charAt(i)));
                stack.push(string.charAt(i));
            }
        }
        for (int i = 0; stack.size() != 0;i++) {
            reverse = reverse.concat(String.valueOf(stack.pop()));
        }
        return clean.equals(reverse);
    }
}
