public class RecursiveFactorial {
    public static void main(String[] args) {

        System.out.println("Recursive Method: ");
        System.out.print(recursiveFact(5));
        System.out.println("\nIterative Method: ");
        System.out.print(iterativeFact(5));
    }
    public  static int recursiveFact(int num){
        if(num==0){
            return 1;
        }
        return num*recursiveFact(num-1);
    }
    public static int iterativeFact(int num){
        int fact = 1;
        for (int i = num; i>0; i--) {
            fact*=i;
        }
        return  fact;
    }
}
