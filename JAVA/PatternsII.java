/*

to print hollow rectangle pattern
*****
*   *
*   *
*****


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
 */


/*
to print inverted half star 
    * 
   **
  ***
 ****
 */
/* 
 public class PatternsII {

    public static void invertAndRotatedPyramid(int maxRows ){
        for(int i = 1 ; i<=maxRows ; i++){
            //for spaces
            for(int j=1 ; j<=maxRows-i ; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            } 
            System.out.println();
        }
    }
    public static void main (String args[]){
        invertAndRotatedPyramid(9);
    }
}
*/


/*
inverted half pyramid with numbers
12345
1234
123
12
1
 */

public class PatternsII{
    public static void invertedHalfPyramid(int maxRows){
        for(int i=1 ;i<=maxRows; i++ ){
            for(int num =1 ; num<= maxRows-i+1 ; num++){
                System.out.print(num);
            }
            for(int space = 1 ; space<=i-1 ; space++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        invertedHalfPyramid(5);
    }
}