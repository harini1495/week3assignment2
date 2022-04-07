package week3.day2;

public class College extends University {

	@Override
	public void pg() {
		// TODO Auto-generated method stub
		System.out.println("MBA COMPLETED 2019");
		
	}
	public static void main(String[] args) {
		
		College abbstract = new College();
		abbstract.ug();
		abbstract.pg();
	}

}
