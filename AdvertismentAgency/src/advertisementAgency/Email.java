package advertisementAgency;

public class Email extends AdvertisementMode{
	
	String Message;

	   public Email(String Message, Advertisement advertisement) {
	      super(advertisement);
	      this.Message = Message;
	   }

	   public void send() {
		   advertisement.makeEmail(Message);
		   advertisement.makeSMS(Message);
		   advertisement.makeInMail(Message);
	   }
}
