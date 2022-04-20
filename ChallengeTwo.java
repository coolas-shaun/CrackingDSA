public class ChallengeTwo {
    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};

        System.out.println("Before Sorting: ");
        for (int ele : array) {
            System.out.print(" " + ele);
        }
        insertionSort(array, array.length);
        System.out.println("\nAfter Sorting: ");
        for (int ele:array) {
            System.out.print(" "+ele);
        }
    }
    public static void insertionSort(int[] array, int items) {
        if (items < 2) {
            return;
        }
        insertionSort(array, items - 1);
        int element = array[items - 1];
        int i;
        //learnt in this line that we can't give element<array[i-1]&&i>0 ---> array index out of bound
        // Exception is thrown
        for (i = items - 1; i > 0 && element < array[i - 1]; i--) {
            array[i] = array[i - 1];
        }
        array[i] = element;
        System.out.println("\nThe result when items are: "+items);
        for (int j = 0; j < array.length ; j++) {
            System.out.print(array[j]);
            System.out.print(" ");
        }
        System.out.println();
        System.out.print("---------------------------");
    }
}
