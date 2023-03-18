
public class ArrayswapElements {
    public static void main(String[] args) {
        int arr[] = new int[] {2,4,6,8,9,7,5};
        printArray(arr);
        swapElements (1, 5);
        printArray(arr);
    }
    
    

       
        public static void printArray(int[] arr){
            for ( i = 0; i < arr.length; i++){
                System.out.println(arr[i] + " ");
            }
            System.out.println("");
        }

        public static void swapElements(int arr[], int i , int j ){

        if (i<0 || i > arr.length - 1 )
            return;

    
        if ( j<0 || j > arr.length - 1 )
            return;

         int temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp ;
        }
   }