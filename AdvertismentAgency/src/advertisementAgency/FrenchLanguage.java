package advertisementAgency;

public class FrenchLanguage implements Advertisement{
	   @Override
	   public void makeEmail(String Message) {
			  System.out.println();
			  System.out.println("French Language: ");
		      System.out.println(" Email [Langauge: French, Message: " + Message + "]");
	   }
	   
	   public void makeSMS(String Message) {
			  System.out.println(" SMS [Langauge: French, Message: " + Message + "]");
	   }
	   
	   public void makeInMail(String Message) {
		      System.out.println(" In-Mail [Langauge: French, Message: " + Message + "]");
	   }
}
