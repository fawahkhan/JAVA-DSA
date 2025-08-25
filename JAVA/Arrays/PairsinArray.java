package Arrays ;
 public class PairsinArray {

    public static void Pairs(int numbers[]){
        int tp = 0 ;
        for (int i = 0 ; i<numbers.length ; i++){
            int curr = numbers[i];
            for (int j=i+1 ; j<numbers.length ; j++){
                System.out.print("(" + curr + "," + numbers[j] + ")");
                tp++ ;
            }
            System.out.println();
        }
        System.out.print("total pairs" + tp) ;
    }
 
    public static void main(String args[]){
        int numbers[] = {1,3,4,5,6} ;
        Pairs(numbers);
        
    }
 }

 //time complexity 

 /*
  * 
0(n^2)
since we used nested loops
  */