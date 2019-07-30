package decoratorPattern;

public class SampleDecorator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Icecream icecream = new HoneyDecorator(new NuttyDecorator(new SimpleIcecream()));
		    System.out.println(icecream.makeIcecream());
		  

	}

}
