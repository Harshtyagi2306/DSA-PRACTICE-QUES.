public class ArrayBinsearchCeiling {
    public static int binarySearch(int[] input, int elem) {
    	
        int start = 0;
            int end = input.length -1;
        
            
            
            while (start <= end){
                
                int mid = start+(end-start)/2;
                
                if (elem == input[mid]){
                    return mid;
                }
                
               else if (elem > input[mid]){
                    start = mid + 1;
                }
                
                else{
                    end = mid - 1;
                }
                }
                    
                
            return start;
            
           
        }
        public static void main(String[] args) {
            int[] input = {2,4,5,8,9,15,21,28};
            int index = binarySearch(input,4);
            System.out.println(index);
        }
    
    
    }
    
}
