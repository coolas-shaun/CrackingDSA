public class CountingSort {
    public static void main(String[] args) {
        int[] array = {2,5,9,8,2,8,7,10,4,3};
        System.out.println("Before Sorting: ");
        for (int ele : array) {
            System.out.print(" " + ele);
        }
        countingSort(array,1,10);
        System.out.println("\nAfter Sorting: ");
        for (int ele : array) {
            System.out.print(" " + ele);
        }
    }
//    Unsorted = {2,5,9,8,2,8,7,10,4,3}
//    Count array: {0,2,1,1,1,0,1,2,1,1}
//    sorted array: {2,2,3,4,5,7,8,8,9,10}
    public static void countingSort(int array[], int min, int max){
        int[] countArray = new int[max-min+1];
        //traversing the array and counting the elements
        for (int i = 0; i < array.length; i++) {
            countArray[array[i]-min]++;  //counting the occurrence
        }
        int j=0;
        for (int i = min; i <=max ; i++) {
            while(countArray[i-min]>0){
                array[j++] = i;
                countArray[i-min]--;
            }
        }
    }
}
