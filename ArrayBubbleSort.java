public class ArrayBubbleSort {

    public static void bubbleSort(int input[]) {
        for (int i = 0 ; i < input.length - 1; i++){
            for( int j = 0; j < input.length - 1; j++){
                if (input[j] > input[j+1]) {
                int temp = input[j];
                input[j] = input[j+1];
                input[j + 1] = temp;

            }
        }
        
    }

    }
 public static void main(String[] args) {
    int input[]= {8,2,6,1,5};
    bubbleSort(input);
    for( int i =0;i<input.length;i++){
        System.out.println(input[i] + " ");
    }

    
}
}