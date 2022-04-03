//implementation 1 of bubble sort
/*
In Bubble sort swapping happens several times per traversal
* */
public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {20,35,-15,7,55,1,-22};

        System.out.println("Before Sort:");
        for (int ele:array) {
            System.out.print(" "+ele);
        }
        for (int lastunsortedindex = array.length-1; lastunsortedindex >0 ; lastunsortedindex--) {
            for (int i = 0; i < lastunsortedindex; i++) {
                if (array[i]>array[i+1])
                    swap(array,i,i+1);
            }
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
