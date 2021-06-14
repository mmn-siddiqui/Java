package golagandashop;

public class CondensedMilkTopping extends GolaGandaTopping{

	  public CondensedMilkTopping(GolaGanda specialGolaGanda) {
	    super(specialGolaGanda);
	  }

	  public String makeGolaGanda() {
	    return specialGolaGanda.makeGolaGanda() + addCondensedMilk();
	  }

	  private String addCondensedMilk() {
	    return " + Condensed Milk";
	  }
}
