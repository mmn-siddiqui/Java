package golagandashop;

public abstract class GolaGandaTopping implements GolaGanda{
	  protected GolaGanda specialGolaGanda;

	  public GolaGandaTopping(GolaGanda specialGolaGanda) {
	    this.specialGolaGanda = specialGolaGanda;
	  }

	  public String makeGolaGanda() {
	    return specialGolaGanda.makeGolaGanda();
	  }
}
