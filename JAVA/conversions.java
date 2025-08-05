public class conversions {
    //binary to decimal conversion
    public static void binToDec(int binNum){
        int myNum = binNum ;
        int pow = 0 ;
        int decNum = 0 ;
        while (binNum>0){
            int lastDigit = binNum % 10 ;
            decNum = decNum + (int)(lastDigit* Math.pow(2,pow));
            pow++ ;
            binNum/=10 ;
            
        }
        System.out.println("decimal of " + myNum + " = " + decNum);

    

    }


    // decimal to binary 

    public static void decToBin(int decNum){
        int myNum = decNum ;
        int pow = 0 ;
        int binNum = 0 ;
        while(decNum>0){
            int remainder = decNum % 2 ;
            binNum= binNum + (int)(remainder * Math.pow(10 , pow));
            pow++ ;
            decNum/=2 ;
        }
        System.out.println("Binary Number of " + myNum + " = " + binNum);
    }

    public static void main(String args[]){
        binToDec(1010) ;
        decToBin(10);
    }

    
}
