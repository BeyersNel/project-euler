public class Euler_9{
    

     public static void main(String []args){
         
         
         find_1000:
         for (int a = 1; a < 1000; a++) {
              for (int b = a + 1; b < 1000; b++) {
                  for (int c = b + 1; a + b + c <= 1000; c++) {
                      if (a*a + b*b == c*c) {
                        if (a + b + c == 1000) {
                        System.out.println(a*b*c);
                        break find_1000;
                      }
                    }
                }
            }
         }
         
         System.out.println("Completed");
     }
}













