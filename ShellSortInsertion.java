public class ShellSortInsertion {
    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};

        System.out.println("Before Sorting: ");
        for (int ele : array) {
            System.out.print(" " + ele);
        }

        for (int gap = array.length/2;gap>0;gap/=2){
            for (int i = gap; i < array.length; i++) {
                int newElement = array[i];
                int j=i;
                while(j>=gap&&array[j-gap]>newElement ){
                    array[j] = array[j-gap];
                    j-=gap;
                }
                array[j] = newElement;
            }
        }
        System.out.println("\nAfter Sorting: ");
        for (int ele : array) {
            System.out.print(" " + ele);
        }
    }
}
