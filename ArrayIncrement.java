public class ArrayIncrement {
    public static void incrementArray(int input[]){

        for(int i =0; i < input.length; i++){
           input [i]++;

        }
    }

       public static void main(String[] args){
        int arr[] = {2,4,5,6};
        incrementArray(arr);
        print(arr);
       }

    }