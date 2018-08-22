import java.math.*;

public class Euler_16{
    
     public static void main(String []args){
         
         BigInteger BIGNUM = BigInteger.valueOf(2);
         
         for (int i = 1; i < 1000; i++) {
             BIGNUM = BIGNUM.multiply(BigInteger.valueOf(2));
         }
         
         int sum = 0;
         
         while ((BIGNUM.compareTo(BigInteger.valueOf(0))) != 0) {
             sum += (BIGNUM.mod(BigInteger.valueOf(10))).intValue();
             BIGNUM = BIGNUM.divide(BigInteger.valueOf(10));
         }
         
         System.out.println(sum);
         
    }
}














