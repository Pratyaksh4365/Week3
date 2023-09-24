package prereq;

public class Listing {
   // These are examples properties
   private String title;
   private double price;   
   private int quantity;
  
   public String getTitle() {
      return title;
   }
   public void setTitle(String title){
      this.title = title;
   }

   public void setQuantity(int quantity){
      this.quantity = quantity;
   }
  
   public int getQuantity(){
      return quantity;
   }

   public void setPrice(double price){
      this.price = price;   
   }
   public double getPrice(){
      return price;   
   }




   
   public void printInfo() {
      
      System.out.println("Item: " + title);
      System.out.println("\tPrice: " + price);
      System.out.println("\tQuantity: " + quantity);
   }
}