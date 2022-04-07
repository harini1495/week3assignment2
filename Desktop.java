package week3.day2;

public class Desktop implements Software{

	public void desktopModels() {
		// TODO Auto-generated method stub
          System.out.println("Lenove Models latest 2022");
	}

	public void hardwareResources() {
		// TODO Auto-generated method stub
		System.out.println("Hardware");
	}

	public void softwareResources() {
		// TODO Auto-generated method stub
		System.out.println("Software");
	}
	public static void main(String[] args) 
	{
		Desktop innterface = new Desktop();
		innterface.desktopModels();
		innterface.hardwareResources();
		innterface.softwareResources();
		
		
	}
}
