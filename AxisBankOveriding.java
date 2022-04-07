package week3.day2;

public class AxisBankOveriding extends BankInfoOverriding{
	
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Deposit the Amount");
	}
	
	public static void main(String[] args) 
	{
		AxisBankOveriding override = new AxisBankOveriding();
		override.deposit();
		override.fixed();
		override.saving();
	}

}
