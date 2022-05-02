package DataStructures.stack.challengeOne;

import java.util.LinkedList;


public class Palindrome {
    private StringBuilder temp;
    private StringBuilder string;



    public boolean checkPalindrome(String str){
        string = new StringBuilder(str.length());
        LinkedList<Character> stack = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.toLowerCase().charAt(i);
            if(c>='a'&&c<='z'){
                stack.push(c);
                string.append(c);
            }

        }
        temp = new StringBuilder(stack.size());
        while(!stack.isEmpty()){
            temp.append(stack.pop());
        }

        return string.toString().equals(temp.toString());
        //return false;
    }
}
