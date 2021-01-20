package InterviewPractice;

public class Dishtv_recharge // singleton class
{
  static Dishtv_recharge dr;
  private int yearly_subscription;
  private int monthly_payment;
  private String tillDate;
  private static int count=1;
  private Dishtv_recharge()
  {
	  System.out.println("::::Welcome to DishTv Services::::");
	  System.out.println();
	  System.out.println(" **Select your yearly package** ");
	  yearly_subscription=2400;
	  tillDate="June-16-2021";
	  monthly_payment=400;
	  System.out.println("Your Current Account Balance :"+yearly_subscription+" Valid till : "+tillDate);
	  System.out.println("Monthly amount to pay is : "+ monthly_payment);
	  count++;
  }
  public void payment(int amount,String rechargeDate)
  {
	  if(amount==monthly_payment)
	  {
	  System.out.println("Recharge done on :"+ rechargeDate);
	  yearly_subscription=yearly_subscription-amount;
	  System.out.println("Amount paid :"+amount+" Remaing to pay is :"+checkbalance());
	  }
	  else {
		  System.out.println("You can only pay  200 in a month.");
	  }
  }
  private int checkbalance()
  {
	  if(yearly_subscription>0)
	  {
		  return yearly_subscription;
	  }
	  else {
		  System.out.println("Your account balnace is low.."+"\n"+"please recharge soon");
		   return yearly_subscription;
	      }
  }
  public void Rechargetv(int new_tvpackage)
  {
	  System.out.println();
	  System.out.println("Recharge done Successfully..");
	  yearly_subscription=yearly_subscription+new_tvpackage;
	  System.out.println("your current plan :"+checkbalance());
  }
  public static Dishtv_recharge getDishtv_rechargeInstance()
  {
	  if(count==1)
	  {
		  dr=new Dishtv_recharge();
	  }
	  return dr;
  }
}
  
  
  
  
  
