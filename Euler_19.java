public class Euler_19{

     public static void main(String []args) {
         
         int index = 6;
         int sundays = 0;
         
         for (int year = 1901; year <= 2000; year++ ) {
             if ((index = get_month(index, 3)) == 0) {sundays++; System.out.println(year + "\t january");} //december
             if ((index = get_month(index, 3)) == 0) {sundays++; System.out.println(year + "\t february");} //jan
             
             if (year == 1900) {
                 if ((index = get_month(index, 0)) == 0) {sundays++; System.out.println(year + "\t march");}
             } else if (year % 4 == 0) {
                 if ((index = get_month(index, 1)) == 0) {sundays++; System.out.println(year + "\t march");}
             } else {
                 if ((index = get_month(index, 0)) == 0) {sundays++; System.out.println(year + "\t march");}
             }
             
             if ((index = get_month(index, 3)) == 0) {sundays++; System.out.println(year + "\t april");} //march
             if ((index = get_month(index, 2)) == 0) {sundays++; System.out.println(year + "\t may");} //april
             if ((index = get_month(index, 3)) == 0) {sundays++; System.out.println(year + "\t june");} //may
             if ((index = get_month(index, 2)) == 0) {sundays++; System.out.println(year + "\t july");} //june
             if ((index = get_month(index, 3)) == 0) {sundays++; System.out.println(year + "\t august");} //july
             if ((index = get_month(index, 3)) == 0) {sundays++; System.out.println(year + "\t september");} //august
             if ((index = get_month(index, 2)) == 0) {sundays++; System.out.println(year + "\t october");} //september
             if ((index = get_month(index, 3)) == 0) {sundays++; System.out.println(year + "\t november");} //october
             if ((index = get_month(index, 2)) == 0) {sundays++; System.out.println(year + "\t december");} //november
         }
         
         System.out.println(sundays);
         
     }
     
     private static int get_month(int index, int days) {
         return (index + days) % 7;
     }
         
}







