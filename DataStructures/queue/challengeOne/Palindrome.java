package DataStructures.queue.challengeOne;

import java.util.LinkedList;
import java.util.Locale;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {

    public boolean checkPalindrome(String str){
        LinkedList stack = new LinkedList();
        LinkedList queue = new LinkedList();
        Character c;
        for (int i = 0; i < str.length(); i++) {
            c = str.toLowerCase().charAt(i);
            if(c>='a'&&c<='z'){
                stack.push(c);
                queue.addLast(c);
            }
        }
        while(!stack.isEmpty()){
            if(stack.pop()!=queue.removeFirst())
                return false;
        }
        return true;
    }
}
