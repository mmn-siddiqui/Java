package advertisementAgency;

public class InMail extends AdvertisementMode{
	
	String Message;

	   public InMail(String Message, Advertisement advertisement) {
	      super(advertisement);
	      this.Message = Message;
	   }

	   public void send() {
		   advertisement.makeInMail(Message);
	   }
}
