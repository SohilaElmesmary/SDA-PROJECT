
public class RideHistory {
  int rate; 
  Offer price; 
  RideDetails details;
  
   public void setRate(int r)
   {
	   this.rate=r;
	   
   }
   public int getRate()
   {
	return rate;
   }
   public void setPrice (Offer p)
   {
	   this.price=p;
	   
   }
   public Offer getPrice()
   {
	return price;
   }
}
