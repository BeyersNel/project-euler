import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Euler_8{
    

     public static void main(String []args){
         
         int MAX = 0;
         int NOW = 0;
         int arr[] = new int[5];
         int j = 0;
         
         
         
        try {
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            int next_char = 0;
            
            //Initialise the array with the first 5 numbers
            for (int i = 0; i < 5; i++){
                arr[i] = reader.read() - 48;
            }
            
            MAX = get_multiple(arr);
            
            while ((next_char = reader.read()) != -1) {
                
                if (next_char == 10) {
                    if ((next_char = reader.read()) == -1) break;
                }
                
                next_char -= 48;
                
                arr[j] = next_char;
                NOW = get_multiple(arr);
                
                if (NOW > MAX) MAX = NOW;
                
                j++;
                if (j >= 5) j = 0;
                System.out.println("MAX: " + MAX);
            }
        }
        catch (IOException ex) {
           ex.printStackTrace();
        }
        
        System.out.println("MAX: " + MAX);
     }
     
     private static int get_multiple(int[] arr){
         
         return arr[0]*arr[1]*arr[2]*arr[3]*arr[4];
     }
}













