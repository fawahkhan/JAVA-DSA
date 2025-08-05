// import java.util.* ;
// public class functions {

//     public static int calculateSum(int num1 , int num2){//parameters or formal parameters
        
//         int sum = num1+num2 ;
//         return sum ;
   
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum2 = calculateSum(a,b);//arguments or actual parameters
//         System.out.print("Sum is :" + sum2);
//     }
// }



// import java.util.* ;

// public class functions{


//     public static void main(String args[]){
//         // swap - values exchange
//         int a = 5 ;
//         int b = 10 ;

//         //swap

//         int temp = a ;
//         a = b ; 
//         b = temp ;
//         System.out.println("a=" + a);
//         System.out.println("b=" + b);

//     }
// }


// find product of a and B


 

// public class functions{
//     public static int multiply(int a , int b){
//     int product = a * b ;
//     return product ;
//     }
//     public static void main(String args[]){
//         int a = 2 ; 
//         int b = 5 ;
//         int product = multiply(a, b) ;
//         System.out.print("Product = " + product);

//     }
// }



// find factorial of  number 

// public class functions{
//     public static int factorial (int n){
//         int f = 1  ;
//         for ( int i=1 ; i<=n ; i++){
//             f = f*i ; 
//         }
//         return f ; //factorial of n
//     }
//     public static int binCoeff(int n , int r){
        
//         int n_fact = factorial(n);
//         int r_fact = factorial(r);
//         int nmr_fact = factorial(n-r);
//         int bc = n_fact / (r_fact * nmr_fact) ;
//         return bc ;
//     }
//     public static void main(String args[]){
        
//         System.out.println(binCoeff(5, 02));
//     }


// }

public class functions{
    public static boolean isPrime(int n){
        if (n==2){
            return true ;
        }
        for(int i=2 ; i <= Math.sqrt(n) ; i++ ){
            if(n%i == 0){
                return false ; 
            }
        }
        return true ;
    }
    public static void primesInRange(int n){
        for(int i = 2 ; i<= n ; i++){
            if (isPrime(i)){
               System.out.print(i + " ");
            }
           
        } System.out.println();
    } 
    public static void main(String args[]){
        primesInRange(100);
    }
}