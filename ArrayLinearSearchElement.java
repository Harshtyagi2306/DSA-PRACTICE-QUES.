
public class ArrayLinearSearchElement {
    public static void main(String[] args) {
        int a [] ={2,7,6,8,9};
        int search_ele=6;
        boolean flag = false;

        for( int i =0; i < a.length; i++){
            if( search_ele == a[i]){
                System.out.println("Element Found At:" + i);
                flag = true;
                break;
            }
            

        }               
        if(flag == false){
            System.out.println("ELEMENT NOT FOUND");
        }

    }

}