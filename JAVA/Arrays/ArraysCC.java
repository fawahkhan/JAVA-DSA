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
         
        System.out.print("Enter the marks of phy chec=m and maths followed by a space");
        marks[0] = sc.nextInt(); //phy
        marks[1] = sc.nextInt(); //chem
        marks[2] = sc.nextInt(); //math
        System.out.println("phy" + marks[0]);
        System.out.println("chem" + marks[1]);
        System.out.println("maths" + marks[2]);

    
    // if we want to add marks in an array 
    marks[2] = 56 ;// just told the marks that were to be updated
    marks[1] = marks[1] + 5  ;//another way of editing or redefining whats present in an array


    //performing operations on array 

    int percentage = (marks[0]+marks[1]+marks[2])/3 ;

    System.out.println("percentage= " + percentage);

    // to know the length of an array 
    System.out.println("length of array =" + marks.length);




    }



}
