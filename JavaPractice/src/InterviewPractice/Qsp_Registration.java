package InterviewPractice;

public class Qsp_Registration // encapsulation
{
	  private String name;
	  private String address;
	  private long mobNum;
	  private int id;
	  private static int count=01;

	   Qsp_Registration(String name, String address,long mobNum)
	  {
	    this.name=name;
	    this.address=address;
	    this.mobNum=mobNum;
	    this.id=count;
	    count++;
	  }
	  public String getName()
	  {
	    return name;
	   }
	  public void setName(String name)
	  {
	    this.name=name;
	   }
	 public String getAddress()
	  {
	    return address;
	   }
	  public void setAddress(String address)
	  {
	    this.address=address;
	   }
	 public long getMobNum()
	  {
	    return mobNum;
	   }
	 public void setMobNum(long mobNum)
	  {
	    this.mobNum=mobNum;
	   }

	  public int getId()
	  {
	    return id;
	   }

}
