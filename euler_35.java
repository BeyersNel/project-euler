
import java.lang.Math;

// Class for doing all the gnitty-gritty
public class toolbox{
    
    data_structures data_structure;
    print printer;
    processor brain;

     public static void main(String []args){
         
        //init
        //-----------------------------------
        toolbox t = new toolbox();
        t.initialise();
        data_structures d = t.get_data_structure();
        print p = t.get_printer();
        processor b = t.get_brain();
        
        //variables
        //-----------------------------------
        final int prime_array_size = 100;
        
        //process
        //-----------------------------------
        boolean[] prime_array = d.get_boolean_array(prime_array_size, true);
        prime_array = b.eratosthenes(prime_array);
        // p.boolean_array(prime_array);
        
        int test[] = {1,5,4,7,6,1};
        System.out.println(b.array_to_integer(test));
     }
     
     public void toolbox() {
         this.data_structure = new data_structures();
         this.printer = new print();
     }
     
     public void initialise() {
         this.data_structure = new data_structures();
         this.printer = new print();
         this.brain = new processor();
     }
     
     public data_structures get_data_structure()    { return this.data_structure; }
     public print get_printer()                     { return this.printer; }
     public processor get_brain()                   { return this.brain; }
}

// Class for building basic data objects
class data_structures {
    
    // Set default value of boolean array
    public boolean[] get_boolean_array(int array_length, boolean b) {
        boolean boolean_array[] = new boolean[array_length];
        for (int i = 0; i < array_length; i++ ){
            boolean_array[i] = b;    
        }
        return boolean_array;
    }
}

// Class for doing interesting things
class processor {
    
    //filter out primes
    public boolean[] eratosthenes(boolean[] boolean_array) {
        int half_length = boolean_array.length/2 -1;
        
        for (int i = 2; i < half_length; i++) {
            if (boolean_array[i] == false) { continue; }
            
            int k = i*2;
            for (int j = k; j < boolean_array.length; j += i) {
                boolean_array[j] = false;
            }
        }
        return boolean_array;
    }
    
    // public integer[] integer_to_array(integer number) {
        
    // }
    
    public int array_to_integer(int[] number_array) {
        int new_number = number_array[0];
        for (int i = 1; i < number_array.length; i++) {
            new_number *= 10;
            new_number += number_array[i];
        }
        return new_number;
    }
    
}

// Class for visualising everything
class print {
    public void boolean_array(boolean[] boolean_array) {
        for (int i = 0; i < boolean_array.length; i++) {
            System.out.println(i + ": " + boolean_array[i]);
        }
    }
}
//TODO
//set prime counter to zero
//build index of primes up to a million
    //Archimedes filter
    //create bool array
    //initialise all to true
    //create index counter
    //loop up to a million
    //for each
        //add the initial value to itself
        //set array at index to false
        //stop when > million

//Number combinator
    //takes integer and returns it as an array
    //takes array and returns it as an integer
    
//build index of tested numbers up to a million
    //create bool array
    //loop through numbers to test
    //for each
      //skip if a variation of an already tested number (according to the test index)
      //generate 
      //build all combinations of the number
      //check all variations off from the tested number index
      //check if all variations are prime
          //increment counter if true

