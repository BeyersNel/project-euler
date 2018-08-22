public class Euler_4{
    

     public static void main(String []args){
         
        //System.out.println("Hello World");
        
        findpalin:
        for (int i = 999; i > 900; i--) {
            for (int j = 999; j > 900; j--) {
                if (is_palin(i*j)) {
                    System.out.println(i*j);
                    break findpalin;
                }
            }
        }
        
        
     }
     
     /**
      * Check if number is a palindrome
      */
     private static boolean is_palin(int num) {
         
         if (num == 0 || num < 100000) return false;
         
         int numarr[] = new int[6];
         int i = 0;
         
         while (num != 0) {
             numarr[i] = num % 10;
             i++;
             num = num/10;
         }
         
         for (int j = 0; j < 3; j++) {
             if (numarr[j] != numarr[5-j]) return false;
         }
         
         return true;
     }
     
}

