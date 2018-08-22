public class Euler_2{
    

     public static void main(String []args){
         
        //System.out.println("Hello World");
        
        int i = 0;
        int j = 1;
        int k;
        int sum = 0;
        
        
        
        
        while (i < 4000000){
            
            k = i & 1;
            if (k != 1) {
                System.out.print("EVEN ");
                sum += i;
            } else {
                System.out.print("ODD  ");
            }
            
            System.out.println(i);
            j += i;
            
            if ( j > 4000000) {break;}
            
            k = j & 1;
            if (k != 1) {
                System.out.print("EVEN ");
                sum += j;
            } else {
                System.out.print("ODD  ");
            }
            
            System.out.println(j);
            i += j;
        }
        
        System.out.println("Sum: " + sum);
        
     }
}

