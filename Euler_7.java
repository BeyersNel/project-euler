public class Euler_7{
    

     public static void main(String []args){
         
        //System.out.println("Hello World");
        
        int ARRLENGTH = 1000000;
        int primeval = 0;
        boolean pfactors[] = new boolean[ARRLENGTH];
        
        //Initialise boolean array to true
        for (int i = 0; i < ARRLENGTH; i++) {
            pfactors[i] = true;
        }
    	
		
		int primenum = 0;
        
        for (int i = 2; i < ARRLENGTH; i++){
            int k = i;
            int j = k;
            
            if (pfactors[i] == true){
				primenum++;
    				//System.out.println(i + " " + primenum);
				
				if (primenum == 10001) {
					System.out.println(i);
					break;
				}
				
                while (k < ARRLENGTH) {
                    pfactors[k] = false;
                    k += j;
                }
            }
        }
     }
}


