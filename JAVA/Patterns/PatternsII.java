package Patterns;
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
/*
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
 */

// floyd's triangle
// print this pattern
/* 
1
2 3
4 5 6
7 8 9 10
*/ 
/*
public class PatternsII{
    public static void floydsPattern(int maxRows){
        int num = 1 ;
        for (int i=1 ; i<=maxRows ; i++){
            for (int j=1 ; j<=i ; j++){
                System.out.print(num + " ");
                num = num+1 ;
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        floydsPattern(5);
    }
}
     */


/* 
PRINT THIS PATTERN
1
01
101
0101
10101
SOLUTION-
public class PatternsII{
    public static void patternZeroOne(int maxRows ){
        for (int i=1 ; i<=maxRows ; i++){
            for (int j=1 ; j<=i ; j++){
                if((i+j)%2 == 0 ){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }

            }
            System.out.println();
        }

    }
    public static void main(String args[]){
        patternZeroOne(5);
    }
}
 */
public class PatternsII{
    public static void butterfly(int maxRows){
        for (int i=1 ; i<=maxRows ; i++){
            //stars
            for(int j = 1 ; j<=i ; j++){
                System.out.print("*");

            }
            for(int j= 1 ; j<=2*(maxRows-i) ; j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = maxRows; i>=1 ; i--){
             for(int j = 1 ; j<=i ; j++){
                System.out.print("*");

            }
            for(int j= 1 ; j<=2*(maxRows-i) ; j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
            
        }
    }
    public static void main(String args[]){
        butterfly(4);
    }
}

