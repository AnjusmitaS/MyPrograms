package InterviewPractice;

public class Check_Dishtv_Account {

	public static void main(String[] args) {
		Dishtv_recharge dr1=Dishtv_recharge.getDishtv_rechargeInstance();
		dr1.payment(400,"21 nov 2020");
		Dishtv_recharge dr2=Dishtv_recharge.getDishtv_rechargeInstance();
		dr2.payment(400,"21 dec 2020");
		Dishtv_recharge dr3=Dishtv_recharge.getDishtv_rechargeInstance();
		dr3.payment(400,"21 jan 2021");
		dr3.payment(400,"21 feb 2021");
		dr3.payment(400,"21 march 2021");
		dr3.payment(400,"21 april 2021");
		dr3.Rechargetv(1200);
		
		
	/*	Dishtv_recharge dr3=Dishtv_recharge.getDishtv_rechargeInstance();
		dr2.payment(2000,"june",2021,15);
	
	    dr1.Rechargetv(400);*/
	}

}
