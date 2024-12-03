public class selectionSort
{
    //one swap per iteration;

    //function to print the sorted array;
    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.println(j + "");
        }
        System.out.println();
    }

    //main sorting function;
    public static void main(String[] args) {
        int[] arr = {7,8,3,1,2};

        //selection sort;
        for (int i = 0; i <= arr.length-1; i++) {
            int smallest = i;

            //nested loop;
            //this loop will startes from the next element from the smallest one;
            for (int j = i+1; j < arr.length; j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }

            //swaping;
            int swapedVal = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = swapedVal;
        }

        printArray(arr);
    }
}
