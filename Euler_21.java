import java.math.*;

public class Euler_21{
    
     public static void main(String []args){
         
         int map[] = new int[10001];
         map[1] = 1;
         map[2] = 1;
         map[3] = 1;
         
         for (int i = 4; i <= 10000; i++) {
             int limit = (int) Math.sqrt(i);
             int sum = 1;
             for (int j = 2; j < limit; j++) {
                 if (i % j == 0) {
                     sum += (i/j) + j;
                 }
             }
             if (i % limit == 0) sum += limit;
             map[i] = sum;
         }
         
         int sum = 0;
         for (int i = 1; i <= 10000; i++){
             if (map[i] <= 10000 && map[map[i]] == i && map[i] != i) sum += i;
         }
         
         System.out.println(sum);
         
         
         
         
         
         
         
         
         
         
         
    }
    

}
















