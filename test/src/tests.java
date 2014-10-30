
public class tests {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		String value = "1 ~ 1c";
		
		System.out.println(value.substring(0, value.indexOf('~')-1));
		System.out.println(value.substring(value.indexOf('~')+2, value.length()-1));
		
		

	}

}
