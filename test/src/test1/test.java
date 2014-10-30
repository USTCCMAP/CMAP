package test1;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		abs_animal animal = new abs_animal() {
			
			void sleep() {
				// TODO Auto-generated method stub
				System.out.println("sleeping");
			}
			
			void eat(){
				System.out.println("eaint ");
				cry();
			}
			
			public void cry(){
				System.out.println("crying ");
			}
			
		};
		
		
		animal.eat();
		animal.sleep();
		
		abs_animal test2 = new animal();
		test2.eat();
		test2.sleep();
		((animal)test2).run();
		
	}

}
