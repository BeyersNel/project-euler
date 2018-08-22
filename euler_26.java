
class euler_26  {
    public static void main(String[] args) {
		euler_26 program = new euler_26();
		program.doTheThing();
	}
	
	public void doTheThing(){
		//set up values
		int longestNum = 0;
		int lengthCounter = 0;
		int lengthBest = 0;
		int[] repeatList = new int[1001];
		
		for (int i = 2; i < 1000; i++) {
			lengthCounter = 0;
			
			// set up first values
			int x = 10;
			while (x < i) {x *= 10;}
			int first_remainder = (x%i);
			int prev_remainder = first_remainder;
			int rem = (first_remainder*10)%i;
			lengthCounter = 1;
			
			//System.out.print("\t" + first_remainder + "\n");
			repeatList[0] = first_remainder;
			repeatList[1] = rem;
			
			while (first_remainder != rem && prev_remainder != rem && lengthCounter < 1000) {
				prev_remainder = rem;
				rem = (rem*10)%i;
				lengthCounter++;
				repeatList[lengthCounter] = rem;
				//System.out.print("\t" + prev_remainder + "\n");
				if (hasInt(repeatList, rem, lengthCounter-1)) { break; }
			}
			
			if (lengthBest < lengthCounter) {
				lengthBest = lengthCounter;
				longestNum = i;
				System.out.println("i: " + i + "\tlength: " + lengthBest);
			}
			//System.out.println("\n" + 1 + "/" + i + ":\t" + lengthCounter + "\n");
		}
	}

	
	//=========================================
	// TOOLS
	//=========================================
	
	public boolean hasInt(int[] list, int match, int limit) {
		for (int i = 0; i <= limit; i++) {
			if (list[i] == match) { return true; }
		}
		return false;
	}
	
	public int[] clearIntArray(int[] list, int limit) {
		//limit /= 2;
		for (int i = 0; i < limit; i++) {
			list[i] = 0;
		}
		return list;
	}
	
	public int getSum(int[] list, int limit) {
		int iSum = 0;
		for (int i = 0; i < limit; i++) {
			iSum += list[i];
			//System.out.println("sum: " + list[i]);
		}
		return iSum;
	}
	
	public void printList(int[] list, char breaker){
		for (int i = 0; i < list.length; i++) {
			if (list[i] == 0) { break; }
			System.out.print(list[i]);
			System.out.print(breaker);
		}
		System.out.println("");
	}
	
	public void printDivisors(int abundantNum, int[] list, char breaker){
		System.out.println(abundantNum + "\n====" );
		printList(list, breaker);
		System.out.println("");
	}
	
}