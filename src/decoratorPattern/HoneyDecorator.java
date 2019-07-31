package decoratorPattern;

public class HoneyDecorator extends IcecreamDecorator{
	
	public HoneyDecorator(Icecream specialIcecream) {
	    super(specialIcecream);
	  }

	  public String makeIcecream() {
	    return specialIcecream.makeIcecream() + addHoney() + addCream();
	  }

	  private String addHoney() {
	    return " + sweet honey";
	  }
	  
	  private String addCream() {
		  return " + vanilaCream";
	  }

}
