package Arrays;

public class linearSearch {


    //function to find largest as well as smallest number in an array 

    public static int largestNumber(int numbers[]){
        int largest = Integer.MIN_VALUE ; //min value means minus infinity 
        int smallest = Integer.MAX_VALUE ; 
        for(int i = 0 ; i < numbers.length ; i++){
            
            if(largest < numbers[i]){
                largest = numbers[i] ;   
            }
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("smallest value is : " + smallest);
        return largest ;
        
    }









    public static int linearSearching(int numbers[] , int key){
        for (int i = 0 ; i<numbers.length ; i++){
          if (numbers[i]==key){
            return i ;  
          }  
        }
        return -1 ; //for cases which dont exist means the key doesnt exist
    }
    public static void main(String args[]){
        int numbers[] = {1,2,3,10,98,3,54,4,5,6} ;
        // int key = 10;

        // int index = linearSearching(numbers, key) ;
        // if (index == -1){
        //     System.out.println("key not found");

        // } else{
        //     System.out.println("key is at index : " + index);
        // }

        System.out.println("largest number in an array is :" + largestNumber(numbers));


        
    }
}
