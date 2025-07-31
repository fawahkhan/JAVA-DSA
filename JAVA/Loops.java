// print reverse of a number    

// import java.util.* ;

// public class Loops{
//     public static void main(String args[]){
//         System.out.print("Enter a number: ") ;
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt() ;
//         System.out.println("Your Entered number is: " + n);

//         while (n>0){
//             int lastDigit = n%10 ;
//             System.out.print( lastDigit);

//             n/=10 ;
//         }

//     }
// }

// reverse of a number

// public class Loops{
//     public static void main ( String args[]){
//         int n = 203456 ;
//         int rev = 0 ;
        
//         while (n>0){
//             int lastDigit = n%10 ;
//             rev = (rev*10) + lastDigit ;
//             n/=10 ;
//         }
//         System.out.println(rev);
//     }
// }

// import java.util.* ;

// public class Loops{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         do {
//             int n = sc.nextInt() ; 
//             if (n % 10 == 0){
//                 break ;
                
//             }System.out.println(n);
//         }while(true) ;
//     }
// }

// import java.util.* ;

// public class Loops{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in) ;
//         int n = sc.nextInt() ;

//         if (n == 2){
//            System.out.println("n is prime");
//         }
//         else{
//             boolean isPrime = true ; 
//             for (int i=2 ; i<=Math.sqrt(n) ; i++){
//                 if(n%i==0){
//                     isPrime=false ;
//                 }
//             }
//             if (isPrime==true){
//                 System.out.println("n is prime");
//             }else {
//                 System.out.println("n is not pime");
//             }
//         }
//     }
// }

// public class Loops {
//     public static void main(String[] args){ 
//         for(int i=0; i<5; i++) {
//         System.out.println(i); 
//         i+=2;
//         }
//     }
// }
