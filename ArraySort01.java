public class ArraySort01 {
    public static void seperate0s1s(int[] arr){
        if(arr.length <= 1){
            return;
        }
        int left,right;
        left = 0;
        right = arr.length - 1;
         
        while(left<right){
            while(arr[left] % 2 ==0 && left < right ){
                left++;
            }
            if (left < right){
                int x = arr[left];
                arr[left] = arr [right];
                arr[right] = x;

                left++;
                right--;
            }
        }
    

    }
    public static void main(String[] args) {
        int[] arr = {0,1,1,0,0,0,1,1,0,1};
        ArraySort01.seperate0s1s(arr);
    }
    }