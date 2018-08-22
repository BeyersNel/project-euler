import java.math.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Euler_13{
    
     public static void main(String []args){
         
         BigInteger BIGNUM = BigInteger.valueOf(0);
         BufferedReader reader = get_reader();
         
         try{
             for (int i = 0; i < 100; i++) {
                 BigInteger BIGSTRING = new BigInteger(reader.readLine());
                 BIGNUM = BIGNUM.add(BIGSTRING);
             }
         }
        catch (IOException ex) {
            ex.printStackTrace();
        }
        
        BigInteger THRESH = new BigInteger("10000000000");
        
        while (BIGNUM.compareTo(THRESH) > 0 ) {
            BIGNUM = BIGNUM.divide(BigInteger.valueOf(10));
        }
        
        System.out.println(BIGNUM);
        
    }
    
    
        
    private static BufferedReader get_reader() {
    
        BufferedReader reader = null;
        
        try {
            reader = new BufferedReader(new FileReader("input.txt"));
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
        return reader;
    }
    
}














