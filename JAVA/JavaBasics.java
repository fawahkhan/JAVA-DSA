// boiler plate and basics

/* 
public class JavaBasics {
    public static void main (String args[]){
        System.out.print("Hello world");
    }

}
*/


// pattern

 /*  
public class JavaBasics {
    public static void main(String args[]){
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");
    }
}
*/

// variables in java

/* 

public class JavaBasics {
    public static void main (String args[]){
        int a = 10 ; 
        int b = 5 ;
        System.out.println(a);
        System.out.println(b);
        
        String name = "Tony Stark" ;
        System.out.println(name);

        // variables can be redeclared

        a = 50 ;
        System.out.println(a);



    }
}
*/


// sum of a and b 

/* 
public class JavaBasics {
    public static void main(String args[]){
        int a = 5 ;
        int b = 10 ;
        int sum = a+b ;
        System.out.print(sum);
    }
}

*/



// input 

/* 
import java.util.*  ;

public class JavaBasics{
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in) ;
        String input = sc.next() ;
        System.out.println(input);

    }
}
*/

// sum of a and b
/* 
import java.util.* ;

public class JavaBasics{
    public static void main(String args[]){
        int a , b , sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:") ;
        a = sc.nextInt();
        System.out.println("enter b:") ;
        b = sc.nextInt();
        
        sum = a + b ;
        System.out.println(sum);

    }
}
*/


// area of a circle 
/* 
import java.util.* ;

public class JavaBasics {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float rad = sc.nextFloat() ;
        float Area = 3.14f * rad * rad ;
        System.out.println(Area) ; 
    }

    
}
    
*/


// relational operators

/*
public class JavaBasics{
    public static void main(String args[]){
        int a = 4 ;
        int b = 5 ;
        System.out.println(b != a) ; 
    }
}
*/

// conditionals
/*
import java.util.* ;

public class JavaBasics{
    public static void main(String args[]){
        int age = 12 ;
        if (age>=18){
            System.out.println("Adult") ;
        }
        if(age > 13 && age < 18){
            System.out.println("teenager");
        }
        else {
            System.out.println("Minor") ;
        
        }
    }
}
 */

//  largest of two numbbers
/*
 * public class JavaBasics{
    public static void main(String args[]){
        int A = 2 ;
        int B = 5 ;

        if (A > B){
            System.out.println(A);
        }else{
            System.out.println(B);
        }

    }
}
 */


/*
import java.util.* ;

public class JavaBasics{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("ENter a number : ");
        int number = sc.nextInt();

        if ( number%2 ==0 ){
            System.out.println("THE NUMBER IS EVEN");
        } else {
            System.out.println("the number is odd");
        }
    }
}
   
 */


//  income tax calculator
/* 
import java.util.* ;

public class JavaBasics{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER YOUR INCOME : ");
        int income = sc.nextInt();
        int tax ;

        if(income< 500000){
            tax = 0 ;
            System.out.println(tax);
        }
        else if(income>500000 && income<1000000){
            tax = (int)(income * 0.2) ;
            System.out.println(tax) ; 
        }
        else if (income > 1000000){
            tax = (int)(income*0.5) ;
            System.out.println(tax);
        }

    }
}
*/

// print numbers fro 1 to n 

import java.util.* ;
public class JavaBasics {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the number n : ") ; 
        int n = sc.nextInt();
        int i=0 ;
    

        while(i <= n){
            System.out.println(i);
            i++ ;
        }

        
    }

    
}