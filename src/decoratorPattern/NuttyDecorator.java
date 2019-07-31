package decoratorPattern;

public class NuttyDecorator extends IcecreamDecorator {
	
	public NuttyDecorator(Icecream specialIcecream) {
	    super(specialIcecream);
	  }

	  public String makeIcecream() {
	    return specialIcecream.makeIcecream() + addNuts() + addFruits();
	  }

	  private String addNuts() {
	    return " + cruncy nuts";
	  }
	  private String addFruits() {
		  return " + mango";
	  }

}
