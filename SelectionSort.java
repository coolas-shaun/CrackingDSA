/*
In Selection sort swapping happens only once per traversal
* */
public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {20,35,-15,7,55,1,-22};

        System.out.println("Before Sort:");
        for (int ele:array) {
            System.out.print(" "+ele);
        }

        for (int lastUnsortedIndex= array.length-1; lastUnsortedIndex>0 ; lastUnsortedIndex--) {
            int large=0;
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (array[large]<array[i])
                    large=i;
            }
            swap(array,large,lastUnsortedIndex);
        }
        System.out.println("\nAfter Sort:");
        for (int ele:array) {
            System.out.print(" "+ele);
        }
    }

    //***********Used to swap the elements********************

    public static void swap(int[] array, int i, int j){
        if (i==j){
            return;
        }
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
