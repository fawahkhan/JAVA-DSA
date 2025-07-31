/* 
*
**
***
****
print this pattern


public class PatternsI {
    public static void main(String args[]){
        for (int line=1 ; line<=4 ; line++){
            for(int star=1 ; star<=line ; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/
/*
 ****
 ***
 **
 *
 print this pattern
 */

/*
public class PatternsI{
    public static void main(String args[]){
        int line , star , n ;
        n=4 ;
        for (line=1 ; line<=n ; line++){
            for (star=1 ; star<=n-line+1 ; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/
/* 
Print this
1
12
123
1234

public class PatternsI {
    public static void main(String args[]){
        for (int line=1 ; line<=4 ; line++){
            for(int star=1 ; star<=line ; star++){
                System.out.print(star);
            }
            System.out.println();
        }
    }
}
*/
/* 
A
BC
DEF
GHIJ
public class PatternsI{
    public static void main(String args[]){
        char ch = 'A' ;
        int n = 4 ;

        for (int i=1 ; i<=n ; i++){
            for (int chars=1 ; chars<=i ; chars++){
                System.out.print(ch);
                ch++ ;
            }
            System.out.println();
        }
    }
}
*/
