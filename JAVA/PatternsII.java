public class PatternsII {
    public static void SquarePattern(int maxRows , int maxCols){
        for (int i=1 ; i<=maxRows ; i++){
            for (int j=1 ; j<= maxCols ; j++){
                if( i==1 || i==maxRows || j==1 || j==maxCols){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        
        

    }
    public static void main(String args[]){
        SquarePattern(4,5);
    }
    
}
