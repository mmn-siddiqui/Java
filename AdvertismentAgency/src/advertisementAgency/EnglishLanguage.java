package advertisementAgency;

public class EnglishLanguage implements Advertisement{
	   @Override
	   public void makeEmail(String Message) {
			  System.out.println();
			  System.out.println("English Language: ");
		      System.out.println(" Email [Langauge: English, Message: " + Message + "]");
	   }
	   
	   public void makeSMS(String Message) {
			  System.out.println(" SMS [Langauge: English, Message: " + Message + "]");
	   }
	   public void makeInMail(String Message) {
		      System.out.println(" In-Mail [Langauge: English, Message: " + Message + "]");
	   }
}
