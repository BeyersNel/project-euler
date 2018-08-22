import java.math.BigInteger;

public class Euler_15{

     public static void main(String []args){
        //System.out.println("Hello World");
        
        int size = 20;
        
        BigInteger ALL = get_factorial(size*2);
        BigInteger NOT_DISTINCT = get_factorial(size);
        NOT_DISTINCT = NOT_DISTINCT.multiply(NOT_DISTINCT);
        
        
        System.out.println(ALL.divide(NOT_DISTINCT));
        
        
        
        
     }
     
     private static BigInteger get_factorial(int num){
         
         
         BigInteger BIGNUM = BigInteger.valueOf(num);
         
         while (num > 2){
             num--;
             BIGNUM = BIGNUM.multiply(BigInteger.valueOf(num));
         }
         return BIGNUM;
     }
}

