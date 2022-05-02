package DataStructures.stack.challengeOne;

public class Main {
    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        //expected:true
        System.out.println(p.checkPalindrome("MalayAlam"));

        //expected:false
        System.out.println(p.checkPalindrome("Hello world"));

        //expected:true
        System.out.println(p.checkPalindrome("Was it a car or a cat I saw?"));

        //expected:true
        System.out.println(p.checkPalindrome("I did, did I?"));
    }
}
