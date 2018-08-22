public class Euler_14{
    
     public static void main(String []args){
         
         int ARRLENGTH = 1000000;
         
         int arr[] = new int[ARRLENGTH];
         for (int i = 0; i < ARRLENGTH; i++) {
             arr[i] = 0;
         }
         
         int MAX = 0;
         int MAXI = 0;
         
         long j;
         int count;
         for (int i = 1; i < ARRLENGTH; i++) {
             j = (long) i+1;
             count = 1;
             
             //System.out.print(j + " ");
             
             while (j >= i + 1) {
                 j = collatz(j);
                 count++;
                 //System.out.print(j + " ");
             }
             
             count += arr[(int) j-1];
             arr[i] = count;
             if (count > MAX) {
                 MAX = count;
                 MAXI = i+1;
             }
             //System.out.println("\ncount: " + count + "  j: " + j);
             //System.out.println();
         }
         /*
         for (int i = 0; i < ARRLENGTH; i++) {
             System.out.print(arr[i] + " ");
         }*/
         System.out.println(MAX + " " + MAXI);
         
         
    }
    
    private static long collatz(long val){
        if ((val &  1) == 1) {
            return val*3L + 1L;
        } else {
            return val/2L;
        }
    }

}















