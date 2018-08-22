import java.util.Arrays;

class euler_27  {
	boolean[] primes=new boolean[100000];
	
    public static void main(String[] args) {
		euler_27 program = new euler_27();
		program.doTheThing();
	}
	
	public void doTheThing(){
		fillSieve();
		
		int best_count = 0;
		int count = 0;
		
		b_loop:
		for (int b = 2; b < 1000; b++) {
			if (!isPrime(b)) { continue; }
			
			a_loop:
			for (int a = -b; a < 1000; a++) {
				
				int n = -1;
				int calculation = 0;
				do {
					n++;
					calculation = n*n + n*a + b;
				} while (calculation >= 0 && isPrime(calculation));
				
				
				if (n > best_count) {
					best_count = n;
					int value = n*n + a*n + b;
					System.out.println("n: " + n + "\t a: " + a + "\t b: " + b + "\t = " + value + " \ttimes: " + a*b);
				}
			}
		}

		
		
	}
	
	
	//=========================================
	// TOOLS
	//=========================================
	
	
	public boolean isPrime(int n) {
		return primes[n];
	}
	
	public void fillSieve() {
		Arrays.fill(primes,true);        // assume all integers are prime.
		primes[0]=primes[1]=false;       // we know 0 and 1 are not prime.
		for (int i=2;i<primes.length;i++) {
			//if the number is prime, 
			//then go through all its multiples and make their values false.
			if(primes[i]) {
				for (int j=2;i*j<primes.length;j++) {
					primes[i*j]=false;
				}
			}
		}
	}
	
}
	
	
	
	
