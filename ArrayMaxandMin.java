public class ArrayMaxandMin {
    public static void main(String[] args) {
        int arr[] = {6,2,3,4,1,9};
        findMinAndMax(arr);

    }
    static void findMinAndMax(int[] arr){
        if(arr==null || arr.length==0 ) return;
        int min=arr[0];
        int max = arr[0];


        for(int i=1; i<arr.length;i++){
            if(arr[i]< min){
                min = arr[i];
            }
            if (arr[i]> max){
                max = arr[i];
            }
             /*OR
            min = Math.min(min,arr[i]);
            max = Math.max(max,arr[i]);*/

           
            
        }
        System.out.println("maximum" + max);
        System.out.println("minimum" + min);
    }
    
}
