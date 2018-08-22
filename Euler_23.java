/**
 * The HelloWorldApp class implements an application that
 * simply prints "Hello World!" to standard output.
 */
class euler_23  {
    public static void main(String[] args) {
		euler_23 program = new euler_23();
		program.doTheThing();
	}
	
	public void doTheThing(){
		//set up values
		int arraySize = 28123;
		//int arraySize = 1000;
		int abundantCounter = 0;
		int[] abundantNumbers = new int[arraySize];
		int[] moduloNumbers = new int[arraySize];
		moduloNumbers = clearIntArray(moduloNumbers, arraySize/2+1);
		
		//get abundant numbers
		for (int x = 0; x < arraySize; x++) {
			int arrCounter = 0;
			moduloNumbers = clearIntArray(moduloNumbers, x);
			for (int i = 2; i <= x/2; i++) {
				if (x % i == 0) {
					moduloNumbers[arrCounter] = i;
					arrCounter++;
				}
			}
			int iSum = getSum(moduloNumbers, arrCounter);
			if (iSum > x) {
				abundantNumbers[abundantCounter] = x;
				abundantCounter++;
				//printDivisors(x, moduloNumbers, ' ');
			}
		}
		
		int[] antiSet = new int[arraySize];
		int[] sumArrayI = new int[arraySize];
		int[] sumArrayJ = new int[arraySize];
		antiSet = clearIntArray(antiSet, arraySize);
		
		for (int i = 0; i < arraySize; i++) {
			for (int j = 0; j <= i; j++) {
				if (abundantNumbers[i] == 0) { break; }
				if (abundantNumbers[j] == 0) { break; }
				int iSum = abundantNumbers[i] + abundantNumbers[j];
				if (iSum >= arraySize) { break; }
				antiSet[iSum] = 1;
				sumArrayI[iSum] = abundantNumbers[i];
				sumArrayJ[iSum] = abundantNumbers[j];
			}
		}
		printList(antiSet, '\n');
		
		int total = 0;
		for (int i = 0; i < antiSet.length; i++) {
			//System.out.println(i + ":\t" + sumArrayI[i] + "\t" + sumArrayJ[i]);
			if (antiSet[i] == 1) { continue; }
			//System.out.println(i);
			total += i;
		}
		System.out.println(total);
			
	}

	
	//=========================================
	// TOOLS
	//=========================================
	
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