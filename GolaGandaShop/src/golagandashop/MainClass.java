package golagandashop;
import java.util.Scanner;

public class MainClass {
	//Price Small
	static int priceSmallComelle(int pricesmall,int comelle){
		  return pricesmall+comelle;
	  }
	static int priceSmallNutella(int pricesmall,int nutella){
		  return pricesmall+nutella;
	  }
	//Price Medium
	static int priceMediumComelle(int pricemedium,int comelle){
		  return pricemedium+comelle;
	  }
	static int priceMediumNutella(int pricemedium,int nutella){
		  return pricemedium+nutella;
	  }
	
	static int priceLargeComelle(int pricelarge,int comelle){
		  return pricelarge+comelle;
	  }
	static int priceLargeNutella(int pricelarge,int nutella){
		  return pricelarge+nutella;
	  }

	public static void main(String args[]) {
		  int pricesmall = 50;
		  int pricemedium = 80;
		  int pricelarge = 100;
		  int nutella = 20;
		  int comelle = 10;
		  int type; 
		  int size;
		  int priceSmallComelle = priceSmallComelle(50, 10);
		  int priceSmallNutella = priceSmallNutella(50, 20);
		  
		  int priceMediumComelle = priceMediumComelle(80, 10);
		  int priceMediumNutella = priceMediumNutella(80, 20);
		  
		  int priceLargeComelle = priceLargeComelle(100, 10);
		  int priceLargeNutella = priceLargeNutella(100, 20);
		  
		  
		  
		  Scanner inp = new Scanner(System.in);

		 // System.out.println(""+ Integer.sum(pricesmall, nutella));
		  System.out.println("Select the Gola Ganda");
		  System.out.println("1: Small");
		  System.out.println("2: Medium");
		  System.out.println("3: Large");
	
	
		  
		      
		   switch (size = inp.nextInt()) 
		   {
		   case 1 :
			   System.out.println("1: Simple Small Gola Ganda");
			   System.out.println("2: Small Gola Ganda With Condensed Milk");
			   System.out.println("3: Small Gola Ganda With Nutella");
			   System.out.println("4: Small Gola Ganda With Nutella and Condensed Milk");
			   
			switch (type = inp.nextInt()) {
			case 1: 
				System.out.println("Basic Small Gola Ganda : Rs." +pricesmall);
				break;
			
			case 2 :
				 GolaGanda golaganda = new CondensedMilkTopping(new SmallGolaGanda());
				 System.out.println(golaganda.makeGolaGanda() + ": Rs." +priceSmallComelle);
				 //System.out.println("Gola Ganda With Condensed Milk : Rs." +(price+comelle));
				 break;	
			   
			case 3 :
				GolaGanda golganda = new NutellaTopping(new SmallGolaGanda());
				System.out.println(golganda.makeGolaGanda() + ": Rs." +priceSmallNutella);
				//System.out.println("Gola Ganda With Nutella : Rs." +(price+nutella));
				break;
				   
			case 4 :
				   GolaGanda glaganda = new CondensedMilkTopping(new NutellaTopping(new SmallGolaGanda()));
				   System.out.println(glaganda.makeGolaGanda() + ": Rs." +(pricesmall+comelle+nutella));
				   //System.out.println("Gola Ganda With Condensed Milk And Nutella : Rs." +(price+comelle+nutella));
				   break;	
			}
			break;
			
		   	case 2 :
		   	   System.out.println("1: Simple Medium Gola Ganda");
			   System.out.println("2: Medium Gola Ganda With Condensed Milk");
			   System.out.println("3: Medium Gola Ganda With Nutella");
			   System.out.println("4: Medium Gola Ganda With Nutella and Condensed Milk");
			   
			   switch (  type = inp.nextInt()) {
				case 1: 
					System.out.println("Basic Medium Gola Ganda : Rs." +pricemedium);
					break;
				
				case 2 :
					 GolaGanda golaganda = new CondensedMilkTopping(new MediumGolaGanda());
					 System.out.println(golaganda.makeGolaGanda() + ": Rs." +priceMediumComelle);
					 //System.out.println("Gola Ganda With Condensed Milk : Rs." +(price+comelle));
					 break;	
				   
				case 3 :
					GolaGanda golganda = new NutellaTopping(new MediumGolaGanda());
					System.out.println(golganda.makeGolaGanda() + ": Rs." +priceMediumNutella);
					//System.out.println("Gola Ganda With Nutella : Rs." +(price+nutella));
					break;
					   
				case 4 :
					   GolaGanda glaganda = new CondensedMilkTopping(new NutellaTopping(new MediumGolaGanda()));
					   System.out.println(glaganda.makeGolaGanda() + ": Rs." +(pricemedium+comelle+nutella));
					   //System.out.println("Gola Ganda With Condensed Milk And Nutella : Rs." +(price+comelle+nutella));
					   break;	
				}
				break;
				
		   	case 3 :
			   	   System.out.println("1: Simple Large Gola Ganda");
				   System.out.println("2: Large Gola Ganda With Condensed Milk");
				   System.out.println("3: Large Gola Ganda With Nutella");
				   System.out.println("4: Large Gola Ganda With Nutella and Condensed Milk");
				   
				   switch (  type = inp.nextInt()) {
					case 1: 
						System.out.println("Basic Large Gola Ganda : Rs." +pricelarge);
						break;
					
					case 2 :
						 GolaGanda golaganda = new CondensedMilkTopping(new LargeGolaGanda());
						 System.out.println(golaganda.makeGolaGanda() + ": Rs." +priceLargeComelle);
						 //System.out.println("Gola Ganda With Condensed Milk : Rs." +(price+comelle));
						 break;	
					   
					case 3 :
						GolaGanda golganda = new NutellaTopping(new LargeGolaGanda());
						System.out.println(golganda.makeGolaGanda() + ": Rs." +priceLargeNutella);
						//System.out.println("Gola Ganda With Nutella : Rs." +(price+nutella));
						break;
						   
					case 4 :
						   GolaGanda glaganda = new CondensedMilkTopping(new NutellaTopping(new LargeGolaGanda()));
						   System.out.println(glaganda.makeGolaGanda() + ": Rs." +(pricelarge+comelle+nutella));
						   //System.out.println("Gola Ganda With Condensed Milk And Nutella : Rs." +(price+comelle+nutella));
						   break;	
					}
					break;
		     
		   			default:
		   					System.out.println("Select Correct Choice");
		   }
	  }
}