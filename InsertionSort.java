/*My Logic which is little lengthy compared to instructor's code. :)
* */
public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};

        System.out.println("Before Sorting: ");
        for (int ele : array) {
            System.out.print(" " + ele);
        }

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {
            int newElement = array[firstUnsortedIndex];
            for (int i = firstUnsortedIndex - 1; i >= 0; i--) {
                if (newElement <= array[i]) {
                    array[i + 1] = array[i];
                }
                else {
                    array[i+1] = newElement;
                    break;
                }
                array[i] = newElement;
            }

        }
        System.out.println("\nAfter Sorting: ");
        for (int ele:array) {
            System.out.print(" "+ele);
        }

    }
}
