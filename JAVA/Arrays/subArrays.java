package Arrays;

public class subArrays {
    //any part of the array which is CONTINUOUS is called SUBARRAY

    public static void printSubarrays(int numbers[]){
        for (int i = 0 ; i< numbers.length ; i++){
            int start = i ;
            for (int j = 0 ; j< numbers.length ; j++){
                int end = j ; 
                for ( int k = start ; k<=end ; k++){
                    System.out.print(numbers[k]+ " ");
                }
                System.out.println();
            }
            System.out.println();

        }
    }
    public static void main(String args[]){

        int numbers[]={1,2,3,4,5,6,7,89,10};
        printSubarrays(numbers);
    }

}
