
public class Euler_12{
    
     public static void main(String []args){
         
         
         int triangle = 1;
         int count = 1;
         int nextval = 2;
         int count_temp = count;
         
         while (count < 500) {
             count = 1;
             triangle += nextval;
             nextval++;
             int temp = triangle;
             
             for (int i = 2; i <= temp; i++) {
                 count_temp = count;
                 
                 while (temp % i == 0) {
                     count += count_temp;
                     temp /= i;
                 }
             }
         }
         
         System.out.println(triangle + "\t\t" + count);
         
    }
    

}















