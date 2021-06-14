package advertisementAgency;
import java.util.Scanner;

public class Advertised {
	   public static void main(String[] args) {
		   
		   int lang; 
		   Scanner inp = new Scanner(System.in);

		   System.out.println("SELECT THE LANGUAGE IN WHICH YOU WANT TO SEE ADVERTISEMENT:");
		   System.out.println("1: English");
		   System.out.println("2: Italian");
		   System.out.println("3: French");
		   
		   lang = inp.nextInt();
		   
		   switch (lang) 
		   {
		   case 1 :
			   AdvertisementMode englishLanguage = new Email("Hello", new EnglishLanguage());
			   AdvertisementMode englshLanguage = new SMS("Hello", new EnglishLanguage());
			   AdvertisementMode engLanguage = new InMail("Hello", new EnglishLanguage());
			   englishLanguage.send();
			   break;
		   
		   case 2 :
			   AdvertisementMode italianLanguage = new Email("Ciao", new ItalianLanguage());
			   AdvertisementMode italanLanguage = new SMS("Ciao", new ItalianLanguage());
			   AdvertisementMode itlLanguage = new InMail("Ciao", new ItalianLanguage());
			   italianLanguage.send();
			   break;
		   
		   case 3 :
			   AdvertisementMode frenchLanguage = new Email("Bonjour", new FrenchLanguage());
			   AdvertisementMode frnchLanguage = new SMS("Bonjour", new FrenchLanguage());
			   AdvertisementMode freLanguage = new InMail("Bonjour", new FrenchLanguage());
			   frenchLanguage.send();
			   break;
		   }

		}
}
