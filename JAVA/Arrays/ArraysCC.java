package Arrays;
import java.util.*;

public class ArraysCC {
    public static void main(String args[]){

        //basic syntax .
        int marks[ ]= new int[50] ;  //creates an array of 50 integers
        int numbers[] = {1,2,3} ; //creates an array of 3 numbers 
        String fruits[] = {"apple" , "mango" , "orange"};        
        
        // how to take input 
        Scanner sc = new Scanner(System.in) ;
        // int phy ;
        // phy = sc.nextInt(); 

        marks[0] = sc.nextInt(); //phy
        marks[1] = sc.nextInt(); //chem
        marks[2] = sc.nextInt(); //math
        System.out.println("phy" + marks[0]);
        System.out.println("chem" + marks[1]);
        System.out.println("maths" + marks[2]);

    }
    


}
