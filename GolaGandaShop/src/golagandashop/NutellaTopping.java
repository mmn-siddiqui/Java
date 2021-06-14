package golagandashop;

public class NutellaTopping extends GolaGandaTopping{

	  public NutellaTopping(GolaGanda specialGolaGanda) {
	    super(specialGolaGanda);
	  }

	  public String makeGolaGanda() {
	    return specialGolaGanda.makeGolaGanda() + addNutella();
	  }

	  private String addNutella() {
	    return " + Nutella";
	  }
}
