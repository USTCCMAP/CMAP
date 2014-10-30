
public class ProxyWeather implements weather {

	private Object aaaa;
	
	public ProxyWeather(){
		this.aaaa = new RealWeather();
		System.out.println("ProxyWeather created");
	}
	
	public void func1() {
		// TODO Auto-generated method stub
		((RealWeather)this.aaaa).func1();
		
	}

	public void func2() {
		// TODO Auto-generated method stub
		((RealWeather)this.aaaa).func2();
	}

	public void func3() {
		// TODO Auto-generated method stub
		((RealWeather)this.aaaa).func3();
	}

}
