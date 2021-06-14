package advertisementAgency;

public class SMS extends AdvertisementMode{
	
	String Message;

	   public SMS(String Message, Advertisement advertisement) {
	      super(advertisement);
	      this.Message = Message;
	   }

	   public void send() {
		   advertisement.makeSMS(Message);
	   }
}
