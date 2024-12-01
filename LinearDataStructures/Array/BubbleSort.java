public class BubbleSort {
    
    public static void bubbleSort(int arr[]){

        int unsortedUntilIndex = arr.length - 1;
        boolean sorted = false;

        while (!sorted) {
            sorted = true;

            for(int i = 0; i<unsortedUntilIndex; i++){

                if (arr[i]>arr[i+1]) {
                    
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    sorted = false;
                }
            }
            unsortedUntilIndex--;
        }

    }

    public static void main(String[] args){

        int arr[] = {4,3,2,1};
        bubbleSort(arr);

        System.out.println("Bubble Sort: ");
        for(int i = 0; i <= arr.length-1; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
