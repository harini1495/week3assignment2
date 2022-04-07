package week3.day2;

public class Automation extends MultipleLangauge{

	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("Selenium best tool to support java");
	}

	public void java() {
		// TODO Auto-generated method stub
		System.out.println("core java");
	}

	@Override
	public void python() {
		// TODO Auto-generated method stub
		System.out.println("python also supported selenium");
	}
	
public static void main(String[] args) {
	Automation obj = new Automation();
	obj.Selenium();
	obj.python();
	obj.java();
	obj.ruby();
}
}
