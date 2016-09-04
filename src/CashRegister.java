/**
   A cash register totals up sales and computes change due. Also keeps track
   of the number of items in sale.
*/
public class CashRegister
{
   public static final double QUARTER_VALUE = 0.25;
   public static final double DIME_VALUE = 0.1;
   public static final double NICKEL_VALUE = 0.05;
   public static final double PENNY_VALUE = 0.01;

   private double purchase;
   private double payment;   
   private int itemCount;
   private double changeLeft = 0;

   /**
      Constructs a cash register with no money in it.
   */
   public CashRegister()
   {
      purchase = 0;
      payment = 0;
   }
   /**
      Records the purchase price of an item.
      @param amount the price of the purchased item
   */
   public void recordPurchase(double amount)
   {
      double newTotal = purchase + amount;
      purchase = newTotal;
      itemCount++;
   }
   
   /**
      Enters the payment received from the customer.
      @param dollars the number of dollars in the payment
      @param quarters the number of quarters in the payment
      @param dimes the number of dimes in the payment
      @param nickels the number of nickels in the payment
      @param pennies the number of pennies in the payment
   */
   public void enterPayment(int dollars, int quarters, 
      int dimes, int nickels, int pennies)
   {
      payment = dollars + quarters * QUARTER_VALUE + dimes * DIME_VALUE
         + nickels * NICKEL_VALUE + pennies * PENNY_VALUE;
   }
   
   /**
      Computes the change due and resets the machine for the next customer.
      @return the change due to the customer
   */
   
   
   public int giveDollars(){
	   changeLeft = (payment - purchase)%1;
	   return (int)(payment - purchase);
   }
   
   
   public int giveQuarters(){
	   int output = (int)(changeLeft/0.25);
	   changeLeft = changeLeft%0.25;
	   return output;
   }
   
   public int giveDimes(){
	   int output = (int)(changeLeft/.10);
	   changeLeft = changeLeft%0.10;
	   return output;
   }
   
   public int giveNickels(){
	   int output = (int)(changeLeft/.05);
	   changeLeft = changeLeft%0.05;
	   return output;
   }
   
   public int givePennies(){
	   return (int)(changeLeft/.01);
   }

   public int getItemCount()
   {
      return itemCount;
   }
   
   public double giveChange()
   {
      double change = payment - purchase;
      changeLeft = change;
      purchase = 0;
      payment = 0;      
      itemCount = 0;
      return change;
   }
}