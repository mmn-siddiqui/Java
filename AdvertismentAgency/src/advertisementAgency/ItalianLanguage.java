package advertisementAgency;

public class ItalianLanguage implements Advertisement{
	   @Override
	   public void makeEmail(String Message) {
		  System.out.println();
		  System.out.println("Italian Language: ");
	      System.out.println(" Email [Langauge: Italian, Message: " + Message + "]");
	   }
	   public void makeSMS(String Message) {
			  System.out.println(" SMS [Langauge: Italian, Message: " + Message + "]");
	   }
	   public void makeInMail(String Message) {
		      System.out.println(" In-Mail [Langauge: Italian, Message: " + Message + "]");  
	   }
}
