public class ChallengeThree {
    public static void main(String[] args) {
        String[] array = {"bcdef","dbaqc","abcde","omadd","bbbbb"};
        radixSort(array,5,26);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static  void radixSort(String[] array, int width, int radix){
        for (int i = width-1; i >= 0; i--) {
            radixSingleSort(array,i,radix);
        }
    }
    public static void radixSingleSort(String[] array, int position,int radix){
        int numItems = array.length;
        int[] countArray = new int[radix];
        for(String value:array){
             countArray[getChar(position, value)]++;
        }
        for(int j=1;j<radix;j++){
            countArray[j]+=countArray[j-1];
        }
        String[] temp = new String[numItems];
        for(int k=numItems-1;k>=0;k--){
            temp[--countArray[getChar(position,array[k])]] = array[k];
        }
        for (int i = 0; i < numItems; i++) {
            array[i] = temp[i];
        }
    }
    public static int getChar(int position, String value){
        //return (value/(int) Math.pow(radix,position))%radix;
        //char c = value.charAt(position+width-1);
        return value.charAt(position) - 'a';
    }
}
