/* Much more easy implementation of Insertion Sort
Method by the instructor
* */

public class InsertionSortMethodTwo {
    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};

        System.out.println("Before Sorting: ");
        for (int ele : array) {
            System.out.print(" " + ele);
        }
        for(int firstUnsortedIndex = 1;firstUnsortedIndex< array.length;firstUnsortedIndex++){
            int element = array[firstUnsortedIndex];
            //declaring i outside loop to be accessible outside the loop block
            int i;
            //learnt in this line that we can't give element<array[i-1]&&i>0 ---> array index out of bound
            // Exception is thrown
            for (i = firstUnsortedIndex; i>0&&element<array[i-1] ; i--) {
                array[i] = array[i-1];
            }
            array[i] = element;
        }
        System.out.println("\nAfter Sorting: ");
        for (int ele:array) {
            System.out.print(" "+ele);
        }
    }
}
