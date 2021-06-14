package advertisementAgency;

public abstract class AdvertisementMode {
	   protected Advertisement advertisement;
	   
	   protected AdvertisementMode(Advertisement advertisement){
	      this.advertisement = advertisement;
	   }
	   public abstract void send();	
}
