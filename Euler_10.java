public class Euler_10{
    

     public static void main(String []args){
         
        //System.out.println("Hello World");
        
        int ARRLENGTH = 2000000;
        boolean pfactors[] = new boolean[ARRLENGTH];
        
        //Initialise boolean array to true
        for (int i = 0; i < ARRLENGTH; i++) {
            pfactors[i] = true;
        }
		
		long primenum = 0L;
        
        for (int i = 2; i < ARRLENGTH; i++){
            int k = i;
            int j = k;
            
            
            if (pfactors[i] == true){
				primenum += i;
				
                while (k < ARRLENGTH) {
                    pfactors[k] = false;
                    k += j;
                }
            }
        }
        
		System.out.println(primenum);
     }
}



