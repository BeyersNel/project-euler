import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Euler_18{

     public static void main(String []args){
         
         int arr[][] = new int[15][15];
         BufferedReader reader = get_reader();
        int input = 0;
         
         // Fill arr[][] with input
         for (int i = 0; i < 15; i++){
              for (int j = 0; j <= i; j++){
                  input = get_next_char(reader);
                  arr[i][j] = get_next_char(reader) + input*10;
                  System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
         }
     
            System.out.println();
            System.out.println();
     
         for (int i = 13; i >= 0; i--) {
             for (int j = 0; j < i+1; j++) {
                 if (arr[i+1][j] > arr[i+1][j+1]) {
                    arr[i][j] += arr[i+1][j];
                 } else {
                    arr[i][j] += arr[i+1][j+1];
                 }
                 System.out.print(arr[i][j] + "\t");
             }
            System.out.println();
         }
         
         //System.out.println(arr[0][0]);
     }
     
     
    private static BufferedReader get_reader() {
    
        BufferedReader reader = null;
        
        try {
            reader = new BufferedReader(new FileReader("input.txt"));
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
        return reader;
    }
    
    private static int get_next_char(BufferedReader reader){
        int input = 0;
        try{
        while ((input = reader.read()) < 48 ){}
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
        return input - 48;
        
    }
}







