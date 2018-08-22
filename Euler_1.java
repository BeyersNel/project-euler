public class Euler_1{
    

     public static void main(String []args){
        
        
        
        //System.out.println("Hello World");
        
        
        int var3 = 0;
        int var5 = 0;
        
        int j = 0;
        int MAX = 1000;
        
        while (var3 < MAX || var5 < MAX) {
            if (var3 < var5){
                j += var3;
                var3 += 3;
            } else if (var3 > var5) {
                j+= var5;
                var5 += 5;
            } else {
                j += var3;
                var3 += 3;
                var5 += 5;
            }
            System.out.println("j: " + j + "\tvar3 :" + var3 + "\tvar5 :" + var5);
        }
        
        
        
        
        
        
        
        
     }
}

