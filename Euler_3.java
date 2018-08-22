public class Euler_3{
    

     public static void main(String []args){
         
        //System.out.println("Hello World");
        
        long BIGNUM = 600851475143L;
        int ARRLENGTH = 100000;
        int primeval = 0;
        boolean pfactors[] = new boolean[ARRLENGTH];
        
        //Initialise boolean array to true
        for (int i = 0; i < ARRLENGTH; i++) {
            pfactors[i] = true;
        }
        
        for (int i = 2; i < ARRLENGTH; i++){
            int k = i;
            int j = k;
            
            if (pfactors[i] == true){
                while (k < ARRLENGTH) {
                    pfactors[k] = false;
                    k += j;
                }
                
                while (BIGNUM % i == 0) {
                    BIGNUM = BIGNUM / i;
                    primeval = i;
                    System.out.println(primeval + "\t" + BIGNUM);
                }
            }
            
            
        }
        
        
     }
}

