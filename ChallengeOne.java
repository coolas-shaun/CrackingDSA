public class ChallengeOne {
        public static void main(String[] args) {
            int[] array = {20, 35, -15, 7, 55, 1, -22};
            System.out.println("Before Sorting: ");
            for (int ele : array) {
                System.out.print(" " + ele);
            }
            mergeSort(array,0, array.length);
            System.out.println("\nAfter Sorting: ");
            for (int ele : array) {
                System.out.print(" " + ele);
            }
        }

        public static void mergeSort(int[] input,int start, int end){
            if(end-start<2)
                return;
            int mid = (start+end)/2;
            mergeSort(input,start,mid);
            mergeSort(input,mid,end);
            merge(input,start,end,mid);
        }
        //{20, 35, -15, 7, 55, 1, -22}
        //{7,55}{-22,1}
        // -22, 1
        public static void merge(int[] input,int start,int end,int mid){
            //last element in left partition <= first element in right partition.
            if(input[mid-1]>=input[mid])
                return;
            int i=start;
            int j = mid;
            int tempIndex = 0;
            int temp[] = new int[end-start];
            while(i<mid&&j<end) {
                temp[tempIndex++] = input[i] >= input[j] ? input[i++] : input[j++];
            }
            System.arraycopy(input,i,input,start+tempIndex,mid-i);
            System.arraycopy(temp,0,input,start,tempIndex);
        }

}
