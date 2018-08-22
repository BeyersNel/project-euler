import java.math.*;

public class Euler_25{
    
     public static void main(String []args){
         
         BigInteger DIGITS = BigInteger.valueOf(1);
         
         for (int i = 1; i < 1000; i++) {
            DIGITS = DIGITS.multiply(BigInteger.valueOf(10));
         }
         
         BigInteger FIBNUMA = BigInteger.ONE;
         BigInteger FIBNUMB = BigInteger.ONE;
         int count = 2;
         
         while (FIBNUMB.compareTo(DIGITS) < 0) {
             FIBNUMA = FIBNUMA.add(FIBNUMB);
             FIBNUMB = FIBNUMB.add(FIBNUMA);
             count += 2;
         }
         
         if (FIBNUMA.compareTo(DIGITS) >= 0) {
             System.out.println((--count));
         } else {
             System.out.println(count);
         }
         
    }
    

}
















