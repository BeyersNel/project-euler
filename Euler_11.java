import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Euler_11{
    
     public static void main(String []args){
         
         BufferedReader reader = get_reader();
         int matrix[][] = new int[20][20];
         long MAX = 0L;
         long NOW = 0L;
         
         fill_matrix(reader, matrix);
         
         // Find vertical multiples
         for (int i = 0; i < 16; i++){
             for (int j = 0; j < 20; j++){
                 NOW = matrix[i][j]*matrix[i+1][j]*matrix[i+2][j]*matrix[i+3][j];
                 if (MAX < NOW) MAX = NOW;
             }
         }
         
         // Find horizontal multiples
         for (int i = 0; i < 20; i++){
             for (int j = 0; j < 16; j++){
                 NOW = matrix[i][j]*matrix[i][j+1]*matrix[i][j+2]*matrix[i][j+3];
                 if (MAX < NOW) MAX = NOW;
             }
         }
         
         // Find "/" diagonal  multiples
         for (int i = 4; i < 20; i++){
             for (int j = 0; j < 16; j++){
                 NOW = matrix[i][j]*matrix[i-1][j+1]*matrix[i-2][j+2]*matrix[i-3][j+3];
                 if (MAX < NOW) MAX = NOW;
             }
         }
         
         // Find "\" diagonal  multiples
         for (int i = 0; i < 16; i++){
             for (int j = 0; j < 16; j++){
                 NOW = matrix[i][j]*matrix[i+1][j+1]*matrix[i+2][j+2]*matrix[i+3][j+3];
                 if (MAX < NOW) MAX = NOW;
             }
         }
         
         System.out.println(MAX);
         
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
     
     
     
     private static void fill_matrix(BufferedReader reader, int[][] matrix){
         
         int char1, char2 = 0;
         
         try {
         
             for (int i = 0; i < 20; i++) {
                 for (int j = 0; j < 20; j++) {
                     char1 = reader.read();
                     char2 = reader.read();
                     reader.read();
                     
                     matrix[i][j] =  ((char1-48)*10 + (char2-48));
                     //System.out.print(matrix[i][j] + " ");
                     
                 }
                 reader.read();
                 //System.out.println();
             }
         }
        catch (IOException ex) {
           ex.printStackTrace();
        }
     }
}














