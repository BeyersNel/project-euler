
class euler_30  {
	
    public static void main(String[] args) {
		euler_30 program = new euler_30();
		program.doTheThing();
	}
	
	//354294
	//get upper limit  = 354294
	public void upperLimit(){
		for (int i = 1; i < 10; i++) {
			System.out.println(Math.pow(9,5)*i + ":" + (Math.pow(10,i)-1));
		}
	}
		
	public void doTheThing(){
		int total = 0;
		for (int i = 2; i < 354294; i++) {
			int x = i;
			int z = 0;
			while (x > 0 && z <= i) {
				int y = x%10;
				z += Math.pow(y,5);
				x /= 10;
			}
			if (z == i) { total += z; }
		}
		System.out.println(total);
	}
}