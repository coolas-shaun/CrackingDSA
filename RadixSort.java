public class RadixSort {

    public static void main(String[] args) {
        int[] array = {4725,4586,1330,8792,1594,5729};
        System.out.println("Before Sorting: ");
        for (int ele : array) {
            System.out.print(" " + ele);
        }
        radixSort(array,4,10);
        System.out.println("\nAfter Sorting: ");
        for (int ele : array) {
            System.out.print(" " + ele);
        }
    }
    public static void radixSort(int[] input, int width, int radix){
        for (int i = 0; i <width ; i++) {
            radixSingleSort(input,i,radix);
        }
    }
    public static void radixSingleSort(int[] input, int position, int radix){
        int numItems = input.length;
        int[] countArray = new int[radix];

        for (int value: input) {
            countArray[getDigit(position,value,radix)]++;
        }
        //adjusting the count
        for(int j=1;j<radix;j++){
            countArray[j]+=countArray[j-1];
        }

        int[] temp = new int[numItems];
        for(int k=numItems-1;k>=0;k--){
            temp[--countArray[getDigit(position,input[k],radix)]] = input[k];
        }

        //copying from temp to original array
        for (int i = 0; i < numItems; i++) {
            input[i] = temp[i];
        }
    }
    public static int getDigit(int position, int value, int radix){
        return (value/(int) Math.pow(radix,position))%radix;
    }
}
