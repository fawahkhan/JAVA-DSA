package Arrays;
//it is always applied on sorted arrays . either incrreasing or decreasing order .
public class binarySearch {

    public static int binarySearching(int numbers[] , int key ){
        int start = 0 , end = numbers.length-1 ; 

        while(start<=end){
            int mid = (start + end) / 2 ;

            if(numbers[mid] == key){
                // System.out.println(numbers[mid]);
                // break;
                return mid ; //return the index

            }
            if(numbers[mid]<key){
                start = mid + 1 ; 
            }
            else{
                end = mid-1 ;
            }
            
            
        }
        return -1; //key not found
    }
    public static void main(String args[]){
        int numbers[] = {1,2,3,4,5,6,67,89};
        int key = 67 ;
        int result= binarySearching(numbers, key);
        if (result==-1){
            System.out.println("not found");
        }
        else{
            System.out.println("element found at index: " + result);
        }
    }
    
}
