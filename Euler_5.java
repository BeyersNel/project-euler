public class Euler_5{

     public static void main(String []args){
        //System.out.println("Hello World");
        
        int MAXNUM = 20;
        int k = 6;
        
        for (int i = 4; i <= MAXNUM; i++){
            int l = k;
            while (k % i != 0) {
                k += l;
            }
        }
        
        System.out.println("val: " + k);
        
        
        
        
        
        
        
        
        
        
        
     }
}

