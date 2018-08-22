
class euler_28  {
	
    public static void main(String[] args) {
		euler_28 program = new euler_28();
		program.doTheThing();
	}
	
	public void doTheThing(){
		int b = 2;
		int i = 1;
		int x = 1;
		int max = 1002001;
		
		while (i < max) {
			for (int j = 0; j < 4; j++) {
				i += b;
				x += i;
			}
			b += 2;
		}
		
		System.out.println("i: " + i + "\tb: " + b + "\tx: " + x);
	}
}