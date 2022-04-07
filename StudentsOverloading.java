package week3.day2;

public class StudentsOverloading {
	
	public void getStudentInfo(int id) {
		// TODO Auto-generated method stub
		System.out.println("The id = " + id);

	}
	public void getStudentInfo(int id1,String name) {
		// TODO Auto-generated method stub
		System.out.println("The id1 = " + id1 +"\n" + name);

	}
	public void getStudentInfo(String email,long phonenumber) {
		// TODO Auto-generated method stub
		System.out.println("The email is " + email +"\n" + phonenumber);

	}
	public static void main(String[] args) {
		
		StudentsOverloading overload =  new StudentsOverloading();
		overload.getStudentInfo(1);
		overload.getStudentInfo(2, "HARINI M");
		overload.getStudentInfo("harini1495@gmail.com", 9042149723l);
	}

}
