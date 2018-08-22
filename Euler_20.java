import java.math.*;

public class Euler_20{
    
     public static void main(String []args){
         
         BigInteger BIGNUM = BigInteger.valueOf(100);
         int mul_val = 99;
         int sum_val = 0;
         
         while (mul_val > 0) {
             BIGNUM = BIGNUM.multiply(BigInteger.valueOf(mul_val));
             
             mul_val -= 1;
         }
         System.out.println(BIGNUM);
         
         while (BIGNUM.compareTo(BigInteger.ZERO) > 0) {
             sum_val += (BIGNUM.mod(BigInteger.valueOf(10))).intValue();
             BIGNUM = BIGNUM.divide(BigInteger.valueOf(10));
         }
         
         System.out.println(sum_val);
         
    }
    

}















