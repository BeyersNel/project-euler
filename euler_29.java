
class euler_29  {
	
    public static void main(String[] args) {
		euler_29 program = new euler_29();
		program.doTheThing();
	}
	
	public void doTheThing(){
		
		int base[] = new int[101];
		int power[] = new int[101];
		boolean lookup[][] = new boolean[101][10001];
		
		
		// set up data with default values
		for (int i = 0; i <= 100; i++) {
			for (int j = 0; j < 1000; j++) {
				lookup[i][j] = false;
			}
		}
		for (int i = 0; i <= 100; i++) {
			base[i] = i;
		}
		for (int i = 0; i <= 100; i++) {
			power[i] = 1;
		}
		
		//populate base and power table
		for (int i = 2; i <= 100; i++) {
			int powerCount = 1;
			for (int j = i; j <= 100; j*=i) {
				if (base[j] > i) {
					base[j] = i;
					power[j] = powerCount;
					//System.out.println(j + ":\t" + i + "^" + powerCount);
				}
				powerCount++;
			}
		}
		
		//iterate over all combinations and set boolean table
		for (int i = 2; i <= 100; i++) {
			for (int j = 1; j <= 100; j++) {
				lookup[base[i]][power[i]*j] = true;
				//System.out.print(base[i] + "^" + power[i]*j + "\t");
			}
			//System.out.println();
		}
		
		
		//iterate over table and count distinct numbers
		int count = 0;
		int countTotal = 0;
		for (int i = 2; i <= 100; i++) {
			for (int j = 2; j <= 10000; j++) {
				if(lookup[i][j]) {
					//System.out.println(i + ":" + j);
					count++;
				}
			}
			countTotal += count;
			System.out.println(count);
			count = 0;
		}
		System.out.println(countTotal);
	}
}